package dev.omedia.restwebservice.config.datasource.user;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ConfigurationProperties(prefix = "restws.user.datasource")
public class UserDataSource extends DriverManagerDataSource {
}
