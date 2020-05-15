package com.first.springboot.zzg.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "test")
public class TestConfig {
    private String messsage;
}
