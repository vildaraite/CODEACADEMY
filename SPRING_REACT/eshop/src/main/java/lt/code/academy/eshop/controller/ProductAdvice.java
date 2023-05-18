package lt.code.academy.eshop.controller;
import lt.code.academy.eshop.exception.ProductNotExistRuntimeException;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Date;

@ControllerAdvice
public class ProductAdvice {

    @ExceptionHandler(ProductNotExistRuntimeException.class)
    public String handleProductNotExistException(ProductNotExistRuntimeException exception, Model model) {
        model.addAttribute("productId", exception.getId());

        return "productNotExist";
    }

    @InitBinder
    public void validateEmptyString(WebDataBinder dataBinder) {
        StringTrimmerEditor editor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, editor);
    }

    @ModelAttribute("customDate")
    public Date myCustomDate() {
        return new Date();
    }
}