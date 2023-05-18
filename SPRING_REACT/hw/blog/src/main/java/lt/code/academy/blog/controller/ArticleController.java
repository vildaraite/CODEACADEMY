package lt.code.academy.blog.controller;
import lt.code.academy.blog.dto.Article;
import lt.code.academy.blog.service.ArticleService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;



@Controller
@RequestMapping("/articles")
public class ArticleController {

       private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
       this.articleService = articleService;
   }

   @GetMapping
   public String showArticles(Model model, @PageableDefault(size = 5, sort = {"title"}) Pageable pageable) {
        model.addAttribute("pageOfArticles", articleService.getArticleByPage(pageable));

        return "articles";
   }
   @GetMapping("/search")
  public String search(Model model, @RequestParam(required = false) String category, @RequestParam(required = false) String title){

        model.addAttribute("articles", articleService.getFilteredArticles(category, title));
        return "articles";
   }

    /*@GetMapping
    public String showArticles(Model model) {
        model.addAttribute("articles", articleService.getArticle());

        return "articles";
    }*/
    @GetMapping("/create")
    public String openCreateArticleForm(Model model) {
        model.addAttribute("article", new Article());

        return "form/article";
    }
    @PostMapping("/create")
    public String createProduct(Article article, Model model) {
        model.addAttribute("article", new Article());
        model.addAttribute("message", "Article created successfully");

        articleService.createArticle(article);

        return "form/article";
    }

    @GetMapping("/{id}")
    public String getArticleDetails(@PathVariable UUID id, Model model) {
        model.addAttribute("article", articleService.getArticle(id));

        return "articleDetails";
    }

    @GetMapping("/{id}/update")
    public String openUpdateArticleForm(@PathVariable UUID id, Model model) {
        model.addAttribute("article", articleService.getArticle(id));

        return "form/article";
    }

    @PostMapping("/{id}/update")
    public String updateArticle(Article article, Model model) {
        articleService.updateArticle(article);
        model.addAttribute("articles", articleService.getArticles());

        return "articles";
    }

    @GetMapping("/{id}/delete")
    public String deleteArticle(@PathVariable UUID id, Model model) {
        articleService.deleteArticle(id);
        model.addAttribute("articles", articleService.getArticles());

        return "articles";
    }
}