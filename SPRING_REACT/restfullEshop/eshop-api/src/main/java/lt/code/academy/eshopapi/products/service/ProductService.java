package lt.code.academy.eshopapi.products.service;

import lt.code.academy.eshopapi.products.dto.Product;
import lt.code.academy.eshopapi.products.entity.ProductEntity;
import lt.code.academy.eshopapi.products.exception.ProductNotExistRuntimeException;
import lt.code.academy.eshopapi.products.repository.ProductRepository;
import org.springframework.stereotype.Service;

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

    public Product getProduct(UUID id) {
        return productRepository.findById(id)
                .map(Product::convert)
                .orElseThrow(() -> new ProductNotExistRuntimeException(id));
    }

    public void updateProduct(Product product) {
        getProduct(product.getId());
        productRepository.save(ProductEntity.convert(product));
    }

    public void deleteProduct(UUID id) {
        productRepository.deleteById(id);
    }

    public List<Product> search(String text) {
        return productRepository.findAllByCategoryContainsOrNameContainsOrDescriptionContains(text, text, text)
                .stream()
                .map(Product::convert)
                .toList();
    }
}