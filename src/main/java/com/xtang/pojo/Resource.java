package com.xtang.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/6/26 21:51
 * @Author: xTang
 * @Description:
 */

@Configuration
@ConfigurationProperties(prefix = "com.xtang.opensource")
@PropertySource(value = "classpath:resource.properties")
public class Resource {

    private String name;

    private String website;

    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
