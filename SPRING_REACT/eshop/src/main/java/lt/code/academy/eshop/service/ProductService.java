package lt.code.academy.eshop.service;

import lt.code.academy.eshop.dto.Product;
import lt.code.academy.eshop.entity.ProductEntity;
import lt.code.academy.eshop.exception.ProductNotExistRuntimeException;
import lt.code.academy.eshop.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(Product product) {
        productRepository.save(ProductEntity.convert(product));
    }

    public List<Product> getProducts() {
        return productRepository.findAll()
                .stream()
                .map(Product::convert)
                .toList();
    }

    public Page<Product> getProductByPage(Pageable pageable) {
        return productRepository.findAll(pageable)
                .map(Product::convert);
    }

    public Product getProduct(UUID id) {
        return productRepository.findById(id)
                .map(Product::convert)
                .orElseThrow(() -> new ProductNotExistRuntimeException(id));
    }

    public void updateProduct(Product product) {
        productRepository.save(ProductEntity.convert(product));
    }

    public void deleteProduct(UUID id) {
        productRepository.deleteById(id);
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findAllByCategoryContainsOrNameContainsOrDescriptionContains(category, category, category)
                .stream()
                .map(Product::convert)
                .toList();
    }

    public List<Product> getProductsByCategoryAndPrice(String category, BigDecimal price) {
        return productRepository.getProductsByCategoryAndPrice(category ,price)
                .stream()
                .map(Product::convert)
                .toList();
    }

    public List<Product> getFilteredProducts(String category, BigDecimal price) {
        if(category != null && !category.isBlank()) {

            if(price!= null && !price.equals(0)) {
                return getProductsByCategoryAndPrice(category, price);
            }

            return getProductsByCategory(category);
        }

        return getProducts();
    }
}