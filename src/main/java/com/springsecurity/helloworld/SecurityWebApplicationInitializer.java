package com.springsecurity.helloworld;

//public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
public class SecurityWebApplicationInitializer{
    /**
     * 自动为应用程序中的每个URL注册springSecurityFilterChain过滤器
     * 添加一个加载WebSecurityConfig的ContextLoaderListener
     */
    public SecurityWebApplicationInitializer() {
        //super(WebSecurityConfig.class);
    }
}
