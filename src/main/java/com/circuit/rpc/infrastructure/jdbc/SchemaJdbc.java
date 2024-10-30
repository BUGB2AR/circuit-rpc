package com.circuit.rpc.infrastructure.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class SchemaJdbc {

    private final JdbcTemplate jdbcTemplate;

    public SchemaJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<String> getSchemas() {
        String sql = "SELECT dsSchema FROM basesclientes.base";
        return jdbcTemplate.queryForList(sql, String.class);
    }
}
