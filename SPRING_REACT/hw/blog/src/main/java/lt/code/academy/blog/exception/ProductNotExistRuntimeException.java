package lt.code.academy.blog.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class ProductNotExistRuntimeException extends RuntimeException {

    private final UUID id;
}
