package com.lbt.mail.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author lbt on 2020/1/7
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "lbt.email")
public class EmailConfig {
    private String subject;
    private String from;
    private String to;
    private String[] cc;
}
