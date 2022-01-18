package com.boot.basic.mvc4x;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

//WebApplicationInitializer   servlet提供的配置接口，用来替换web.xml
//实现接口将会自动被SpringServletContainerInitializer 获取
public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MyMvcConfig.class);
        context.setServletContext(servletContext);

        //注册DispathcerServlet
        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);

        //通过设定jvm的spring.profiles.active参数来设置配置环境
        servletContext.setInitParameter("spring.profiles.default","dev");

    }
}
