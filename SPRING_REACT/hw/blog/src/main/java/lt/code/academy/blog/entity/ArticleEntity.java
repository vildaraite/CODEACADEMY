package lt.code.academy.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.code.academy.blog.dto.Article;

import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "articles")
    public class ArticleEntity {
        @Id
        @GeneratedValue
        @Column(columnDefinition = "VARCHAR(36)", updatable = false)
        private UUID id;
        @Column(nullable = false, length = 100)
        private String title;
        @Column(nullable = false, length = 200)
        private String category;
        @Column(nullable = false, length = 500)
        private String description;


        public static ArticleEntity convert(Article article) {
            return new ArticleEntity(
                    article.getId(),
                    article.getTitle(),
                    article.getDescription(),
                    article.getCategory()
            );
        }
    }
