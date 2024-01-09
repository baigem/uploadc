package cmc.uploadc.config;

import io.minio.MinioClient;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Minio 配置信息
 *
 * @author 程梦城
 * @version 1.0.0
 * &#064;date  2023/12/13
 */
@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "cmc.minio")
public class MinioConfig
{
    /**
     * 服务地址
     */
    private String url;

    /**
     * 用户名
     */
    private String accessKey;

    /**
     * 密码
     */
    private String secretKey;

    /**
     * 存储桶名称
     */
    private String bucketName;

    @Bean
    public MinioClient getMinioClient()
    {
        if(url == null || accessKey == null || secretKey == null){
            return null;
        }
        return MinioClient.builder().endpoint(url).credentials(accessKey, secretKey).build();
    }
}
