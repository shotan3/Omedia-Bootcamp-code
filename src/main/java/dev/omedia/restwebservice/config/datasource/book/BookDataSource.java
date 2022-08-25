package dev.omedia.restwebservice.config.datasource.book;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ConfigurationProperties(prefix = "restws.book.datasource")
public class BookDataSource extends DriverManagerDataSource {
}
