package cmc.uploadc.config;

import lombok.Setter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.io.File;

/**
 * 通用映射配置
 *
 * @author 程梦城
 * @version 1.0.0
 * &#064;date  2023/12/13
 */
@Setter
@Configuration
public class ResourcesConfig implements WebMvcConfigurer
{
    @Resource
    LocalFileUploadConfig localFileUploadConfig;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        // 本地文件上传路径
        registry.addResourceHandler(localFileUploadConfig.getPrefix() + "/**")
                .addResourceLocations("file:" + localFileUploadConfig.getPath() + File.separator);
    }
    
    /**
     * 开启跨域
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 设置允许跨域的路由
        registry.addMapping(localFileUploadConfig.getPrefix() + "/**")
                // 设置允许跨域请求的域名
                .allowedOrigins("*")
                // 设置允许的方法
                .allowedMethods("GET");
    }
}