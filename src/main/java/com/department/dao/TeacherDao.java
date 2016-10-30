package com.department.dao;

import com.department.domain.Teacher;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TeacherDao {

    private JdbcTemplate jdbcTemplate;

    public TeacherDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = jdbcTemplate.query("Select * from Teacher",
                new RowMapper<Teacher>() {
                    public Teacher mapRow(ResultSet rs, int i) throws SQLException {
                        Teacher teacher = new Teacher();
                        teacher.setId(rs.getInt("id"));
                        teacher.setFirstName(rs.getString("firstName"));
                        teacher.setLastName(rs.getString("lastName"));
                        return teacher;
                    }
                });

        return teachers;
    }
}
