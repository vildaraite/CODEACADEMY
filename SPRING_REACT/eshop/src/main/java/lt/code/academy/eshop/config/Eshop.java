package lt.code.academy.eshop.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@Setter
@Getter
@PropertySource("classpath:eshop.properties")
public class Eshop {
    @Value("${eshop.name}")
    private String name;
    @Value("#{'${eshop.address}'.split(';')}")
    private List<String> addresses;
    @Value("${eshop.email}")
    private String email;
    @Value("${eshop.phone}")
    private String phone;
    @Value("${eshop.copy.right}")
    private String copyRight;
}