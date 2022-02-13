package com.example.webappv1.dao;

import com.example.webappv1.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//DAO абстрагирует сущности системы и делает их отображение на БД,
// определяет общие методы использования
@Service
public class UserDao {

    private final JdbcTemplate jdbcTemplate;

    private final String CREATE_TABLE = "CREATE TABLE users (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50) NOT NULL, email VARCHAR(70) NOT NULL, date_reg DATE)";
    private final String SELECT_USER_TO_ID = "SELECT * FROM users WHERE id = ?";
    private final String SELECT_ALL = "SELECT * FROM users";
    private final String ADD_USER = "INSERT INTO users(users.name, users.email, users.date_reg) VALUES(?,?,NOW())";
    private final String DELETE_USER_TO_ID = "DELETE FROM users WHERE id = ?";


    private final DataClassRowMapper<User> rowMapper = new DataClassRowMapper<>(User.class);

    @Autowired
    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //получение списка всех пользователей
    public List<User> getAll() {
        return jdbcTemplate.query(SELECT_ALL, rowMapper);
    }

    //добавление пользователя
    public int addUser(String name, String email) {
        return jdbcTemplate.update(ADD_USER, name, email);
    }

    //получение пользователя по id
    public User getUserToId(Integer id) {
        User user = jdbcTemplate.queryForObject(SELECT_USER_TO_ID, rowMapper, id);
        return user;
    }

    // получение списка всех email
    public Set<String> getAllEmails() {
        Set<String> set = new HashSet<>();
        Set<User> userSet = new HashSet<>();
        userSet.addAll(jdbcTemplate.query("SELECT * FROM users", rowMapper));
        return userSet.stream().map(user -> user.getEmail()).collect(Collectors.toSet());
    }

    //удаление по id
    public int deleteToId(Integer id) {
        return jdbcTemplate.update(DELETE_USER_TO_ID, id);
    }

}
