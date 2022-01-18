package com.boot.flyway;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("flyway test");

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@192.168.32.100:1521:starsms");
        dataSource.setPassword("MYTEST");
        dataSource.setUsername("MYTEST");

        FlywayMigration flyway = new FlywayMigration();
        flyway.setDataSource(dataSource);
        flyway.migrate();

    }
}
