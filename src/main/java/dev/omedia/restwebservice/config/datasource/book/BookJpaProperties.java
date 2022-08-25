package dev.omedia.restwebservice.config.datasource.book;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "restws.book.jpa")
@Data
public class BookJpaProperties {
    public static final String UNIT_NAME = "book";
    private final Map<String, String> properties = new HashMap<>();
    public Map<String, String> getProperties() {
        return properties;
    }
}
