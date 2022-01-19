package com.boot.basic.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Value("${project.author.name}")
    private String author;
    @Value("${project.author.from}")
    private String from;

    @Autowired
    private ProjectSettings settings;

    @Autowired
    private MyProperties myProperties;

    /**
     * 方式 使用@Value注入属性，读取配置文件中的属性逐个注入到对应的属性中，可省略setXX方法
     *
     * @return
     */
    @RequestMapping("/author")
    public String getAuthor() {
        return "getAuthor: Name:" + author + " from:" + from;
    }

    /**
     * 方式 使用@Component + @ConfigurationProperties注入配置文件属性,实现将配置文件中的属性映射到projectSettings类组件中
     *
     * @return
     */
    @RequestMapping("/project")
    public String getProject() {
        return "getProject: " + settings.toString();
    }

    @RequestMapping("/myconf")
    public String getMyProperties() {
        return myProperties.toString();
    }

}
