package org.notebook.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "scraped_content")
public class ScrapedContent implements Serializable {

    @Id
    private String id;

    @DBRef
    private Websites websites;

    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public void setWebsites(Websites websites) {
        this.websites = websites;
    }
}
