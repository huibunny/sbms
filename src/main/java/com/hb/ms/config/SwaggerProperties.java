package com.hb.ms.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * https://www.cnblogs.com/harriets-zhang/p/14499870.html
 */
@Component
@ConfigurationProperties("swagger")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SwaggerProperties {
    /**
     * 是否开启swagger，生产环境一般关闭，所以这里定义一个变量
     */
    private Boolean enable;    

    /**
     * api package路径
     */
    private String basePackage;

    /*
     * 标题
     */
    private String title;

    /**
     * 项目应用名
     */
    private String applicationName;

    /**
     * 项目版本信息
     */
    private String applicationVersion;

    /**
     * 项目描述信息
     */
    private String applicationDescription;

    /**
     * 分组名
     */
    private String groupName;

    /**
     * 作者名
     */
    private String author;

    /**
     * 作者URL
     */
    private String authorURL;

    /**
     * 作者email
     */
    private String authorEmail;

    /**
     * 接口调试地址
     */
    private String tryHost;

    
}
