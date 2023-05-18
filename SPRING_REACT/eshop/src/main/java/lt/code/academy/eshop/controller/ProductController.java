package lt.code.academy.eshop.controller;

import jakarta.validation.Valid;
import lt.code.academy.eshop.dto.Product;
import lt.code.academy.eshop.service.MessageService;
import lt.code.academy.eshop.service.ProductService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.SortDefault;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Controller
public class ProductController {

    private final ProductService productService;
    private final MessageService messageService;

    public ProductController(ProductService productService, MessageService messageService) {
        this.productService = productService;
        this.messageService = messageService;
    }

    @GetMapping("/public/products")
    public String showProducts(Model model, @SortDefault(caseSensitive = false, sort = {"name"}) Pageable pageable) {
        model.addAttribute("pageOfProducts", productService.getProductByPage(pageable));

        return "products";
    }

    @GetMapping("/public/products/search")
    public String search(Model model, @RequestParam(required = false) String category, @RequestParam(required = false) BigDecimal price) {
        model.addAttribute("products", productService.getFilteredProducts(category, price));

        return "products";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/products/create")
    public String openCreateProductForm(Model model, String messageKey) {
        model.addAttribute("product", new Product());
        model.addAttribute("message", messageService.getMessage(messageKey));

        return "form/product";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/products/create")
    public String createProduct(@Valid Product product, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "form/product";
        }
        String messageKey = "lt.code.academy.eshop.product.create.success.message";

        productService.createProduct(product);

        return "redirect:/products/create?messageKey=" + messageKey;
    }

    @GetMapping("/public/products/{id}")
    public String getProductDetails(@PathVariable UUID id, Model model) {
        model.addAttribute("product", productService.getProduct(id));

        return "productDetails";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/products/{id}/update")
    public String openUpdateProductForm(@PathVariable UUID id, Model model) {
        model.addAttribute("product", productService.getProduct(id));

        return "form/product";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/products/{id}/update")
    public String updateProduct(Product product) {
        productService.updateProduct(product);

        return "redirect:/public/products";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/products/{id}/delete")
    public String deleteProduct(@PathVariable UUID id) {
        productService.deleteProduct(id);

        return "redirect:/public/products";
    }

    @GetMapping(value = "/public/products/json", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Product> getJsonProducts() {
        return productService.getProducts();
    }

    @GetMapping(value = "/public/products/xml", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public List<Product> getXmlProducts() {
        return productService.getProducts();
    }

}