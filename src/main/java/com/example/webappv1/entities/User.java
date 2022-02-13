package com.example.webappv1.entities;

//Первичная сущность отражающая основные ключи пользователя
// эквивалентна строкам таблицы users
public class User {

    //id
    private Integer id;

    //имя
    private String name;

    //e-почта
    private String email;

    //дата регистрации
    private String dateReg;

    public User(Integer id, String name, String email, String dateReg) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateReg = dateReg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateReg() {
        return dateReg;
    }

    public void setDateReg(String dateReg) {
        this.dateReg = dateReg;
    }
}
