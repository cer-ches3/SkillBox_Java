package org.example.springexample.config;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "app")
public class AppConfig {
    private String name;
    private int maxConnection;
    private boolean enableFeature;

    @Override
    public String toString() {
        return "AppConfig{" +
                "name='" + name + '\'' +
                ", maxConnection=" + maxConnection +
                ", enableFeature=" + enableFeature +
                '}';
    }

    /*@PostConstruct
    public void printConfig() {
        System.out.println(this);
    }*/
}
