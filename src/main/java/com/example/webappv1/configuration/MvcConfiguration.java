package com.example.webappv1.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//WebMvcConfigurer - Определяет методы обратного вызова для настройки Java-Based конфигурации
//для Spring MVC, включенной через @EnableWebMvc.
public class MvcConfiguration implements WebMvcConfigurer {
    //ViewControllerRegistry Помогает с регистрацией простых автоматизированных контроллеров,
    // предварительно настроенных с кодом состояния и / или представлением.
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }

}
