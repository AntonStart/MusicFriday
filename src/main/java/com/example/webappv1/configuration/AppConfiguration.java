package com.example.webappv1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

//Класс конфигурации
@Configuration
public class AppConfiguration {

    //JdbcTemplate - is the central class in the JDBC core package

    //This class executes SQL queries or updates,
    //initiating iteration over ResultSets and catching JDBC exceptions and translating them to the generic,
    //more informative exception hierarchy defined in the org.springframework.dao package
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/db_web");
        driverManagerDataSource.setUsername("anton");
        driverManagerDataSource.setPassword("mysql1212");
        return  driverManagerDataSource;
    }
}
