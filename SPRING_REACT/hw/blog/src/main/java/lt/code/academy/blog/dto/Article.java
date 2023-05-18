package lt.code.academy.blog.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.code.academy.blog.entity.ArticleEntity;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private UUID id;
    private String title;
    private String description;
    private String category;

  public static Article convert(ArticleEntity entity) {
        return new Article(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getCategory()
        );
    }
}