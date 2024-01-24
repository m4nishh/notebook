package org.notebook.service;

import org.notebook.dao.entity.Logins;
import org.notebook.entrypoint.dto.CreateUserRequest;
import org.notebook.entrypoint.dto.CreateUserResponse;

public interface IUserService {


    public CreateUserResponse createUser(CreateUserRequest createUserRequest);

    public CreateUserResponse buildUserResponse(Logins user);

    public Boolean isUserCreated(String email);
}
