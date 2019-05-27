package com.springboot.core;
/*
 * Spring Boot 的运作原理：
 * 回归到@SpringBootApplication 注解，这个注解是一个组合注解
 * 核心功能是@EnableAutoConfiguration注解提供
 * @EnableAutoConfiguration注解信息
 * @EnableAutoConfiguration注解关键功能是@Import注解的导入配置功能，
 * @Import({AutoConfigurationImportSelector.class})
 * AutoConfigurationImportSelector使用SpringFactoriesLoader.loadFactoryNames方法
 * 扫描META-INF/spring.facotries文件，这个文件声明了那些自动配置
 *
 *
 */