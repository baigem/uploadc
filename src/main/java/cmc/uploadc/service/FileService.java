package cmc.uploadc.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传接口
 *
 * @author 程梦城
 * @version 1.0.0
 * &#064;date  2023/12/13
 */
public interface FileService
{
    /**
     * 文件上传接口
     * 
     * @param file 上传的文件
     * @return 访问地址
     * @throws Exception
     */
    public String uploadFile(MultipartFile file) throws Exception;
}
