package com.boot.flyway.java;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class FlywayMigration {
    /**
     * 定义私有数据源
     */
    private DataSource dataSource;

    /**
     * # 该方法用于读取配置文件的数据源
     *
     * @param: dataSource spring中配置的数据源property
     * @return:
     **/
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * # 该方法通过调用flyway的Java API实现指定数据库的版本控制。由于在spring中配置了实例化父类时会执行该方法，
     * 所以在每次项目更新重启之后都会根据定义好的sql脚本自动将数据库更新到匹配的版本
     *
     * @param:
     * @return:
     * @version : flayway core 4.2.0 测试
     **/
    public void migrate() {

       // Flyway flyway = new Flyway();
        //System.out.println(flyway.getClass().getClassLoader().getResource("").getPath());//输出当前目录，用于核对脚本路径是否能正确读取

        //设置数据源
        //flyway.setDataSource(dataSource);
        //flyway.setBaselineOnMigrate(true);
        // 设置存放flyway metadata数据的表名.默认小写的schema_version
        //flyway.setTable("flyway_version");

        //设置sql编码
        //flyway.setEncoding("UTF-8");
        //flyway.migrate();

    }


    /**
     *
     * @param args
     * @version flayway core 4.2.0 测试
     */
    public static void main(String[] args) {
        System.out.println("flyway test");

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/runoob?useUnicode=true&characterEncoding=utf8");
        dataSource.setPassword("nacos");
        dataSource.setUsername("nacos");

        FlywayMigration flyway = new FlywayMigration();
        flyway.setDataSource(dataSource);
        flyway.migrate();
    }

}
