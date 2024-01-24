package org.notebook.service;

import org.jetbrains.annotations.NotNull;
import org.notebook.dao.entity.Logins;
import org.notebook.dao.repo.ILoginsRepo;
import org.notebook.dao.repo.LoginsRepo;
import org.notebook.entrypoint.dto.CreateUserRequest;
import org.notebook.entrypoint.dto.CreateUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private ILoginsRepo loginsRepo;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public CreateUserResponse createUser(@NotNull CreateUserRequest createUserRequest){
        if (!isUserCreated(createUserRequest.getEmail())) {
            Logins user = Logins.builder()
                    .name(createUserRequest.getName())
                    .email(createUserRequest.getEmail())
                    .password(bCryptPasswordEncoder.encode(createUserRequest.getPassword()))
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .build();
            loginsRepo.save(user);
            return buildUserResponse(user);
        }
        return null;
    }
    public Boolean isUserCreated(String email) {
        return Optional.ofNullable(loginsRepo.findByEmail(email))
                .map(Logins::getEmail)
                .filter(emailId -> !email.isEmpty())
                .isPresent();
    }


    public CreateUserResponse buildUserResponse(@NotNull Logins user) {
        return CreateUserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .createdAt(user.getCreatedAt().toString())
                .updatedAt(user.getUpdatedAt().toString())
                .build();
    }
}
