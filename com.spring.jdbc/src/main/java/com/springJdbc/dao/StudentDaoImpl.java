package com.springJdbc.dao;

import com.springJdbc.Student;
import com.springJdbc.entities.StudentDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public int insert(Student student){
        //insert query
        String query ="insert into student(id, name, city) values(?, ?, ?)";
        int r = this.jdbcTemplate.update(query,student.getId(), student.getName(), student.getCity());
        return r;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


}
