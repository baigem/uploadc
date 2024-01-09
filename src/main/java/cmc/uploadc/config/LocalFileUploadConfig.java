package cmc.uploadc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 本地文件上传配置
 *
 * @author 程梦城
 * @version 1.0.0
 * &#064;date  2023/12/13
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "cmc.upload")
public class LocalFileUploadConfig {
    /**
     * 上传文件存储在本地的根路径
     */
    private String path = "";

    /**
     * 资源映射路径 前缀
     */
    private String prefix = "";
    /**
     * 域
     */
    private String domain = "";
}
