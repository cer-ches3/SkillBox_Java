package org.example.springexample;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {
    private BeanTwo beanTwo;

    public BeanOne(BeanTwo beanTwo) {
        this.beanTwo = beanTwo;
    }

    public void sayBeanOne() {
        System.out.println("Я - бин номер 1");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Вызов метода postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Вызов метода preDestroy");
    }
}
