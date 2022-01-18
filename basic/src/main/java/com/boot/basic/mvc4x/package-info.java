package com.boot.basic.mvc4x;
/**
 * Spring MVC 提供了一个DispathcherServlet 来开发Web应用
 * 在Servlet2.5以及以下的时候只要在web.xml配置<servlet>元素即可
 * 包内使用Servlet3.x+ 无 web.xml的配置方式，即实现WebApplicationINitalizer接口 (WebInitializer.java)
 *
 * SpringBoot里面没有我们之前常规web开发的WebContent（WebApp），它只有src目录
 * 在src/main/resources下面有两个文件夹，static和templates
 * springboot默认  static中放静态页面，而templates中放动态页面
 *
 * Thymeleaf 是一个java类库， 它是一个xml/xhtml/html5的模板引擎
 *
 */