package ru.otlev.springcourse.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.otlev.springcourse.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

//Не нужен, т.к. тривиальный маппинг делает сама библиотека
public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();

        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("name"));
        person.setEmail(resultSet.getString("email"));
        person.setAge(resultSet.getInt("age"));

        return person;
    }
}
