package lt.code.academy.eshopapi.products;

import lt.code.academy.eshopapi.products.exception.ProductNotExistRuntimeException;
import lt.code.academy.eshopapi.products.exception.data.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductExceptionAdvice {

    @ExceptionHandler(ProductNotExistRuntimeException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse handleProductNotExistException(ProductNotExistRuntimeException ex) {
        return new ExceptionResponse(String.format("Product does not exist by this%s id", ex.getId()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionResponse handleException(Exception e) {
        return new ExceptionResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}