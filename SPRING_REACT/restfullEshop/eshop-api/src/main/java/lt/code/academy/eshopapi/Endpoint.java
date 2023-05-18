package lt.code.academy.eshopapi;

public interface Endpoint {
    //variable
    String productId = "productId";

    //path
    String ROOT = "/api";
    String PRODUCTS = ROOT + "/products";
    String PRODUCT = "/{"+ productId +"}";
    String SEARCH = "/search";
}