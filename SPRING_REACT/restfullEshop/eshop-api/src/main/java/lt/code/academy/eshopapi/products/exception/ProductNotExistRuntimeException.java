package lt.code.academy.eshopapi.products.exception;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class ProductNotExistRuntimeException extends RuntimeException {
    private final UUID id;
}