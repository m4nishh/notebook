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

@Document(collection = "keywords")
public class Keywords implements Serializable {

    @Id
    private String id;

    @DBRef
    private Websites websites;

    @DBRef
    private  ScrapedContent scrapedContent;

    private String word;
    private String meta_json;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public void setWebsites(Websites websites){
        this.websites = websites;
    }


    public void setScrapedContent(ScrapedContent scrapedContent) {
        this.scrapedContent = scrapedContent;
    }
}
