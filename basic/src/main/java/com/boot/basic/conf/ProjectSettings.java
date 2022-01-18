package com.boot.basic.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component //将本类作为Bean组件放到Spring容器中，
@ConfigurationProperties(prefix = "project") //通过注解prefix属性指定properites的匹配位置
public class ProjectSettings {

    private String name;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ProjectSettings{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
