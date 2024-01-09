package cmc.uploadc.service;

import cmc.uploadc.config.LocalFileUploadConfig;
import cmc.uploadc.utils.FileUploadUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * 本地文件存储
 *
 * @author 程梦城
 * @version 1.0.0
 * &#064;date  2023/12/13
 */
@Primary
@Service
public class LocalSysFileServiceImpl implements FileService
{
    @Resource
    LocalFileUploadConfig localFileUploadConfig;


    /**
     * 本地文件上传接口
     * 
     * @param file 上传的文件
     * @return 访问地址
     * @throws Exception
     */
    @Override
    public String uploadFile(MultipartFile file) throws Exception
    {
        String name = FileUploadUtils.upload(localFileUploadConfig.getPath(), file);
        // 返回全部路径
        return localFileUploadConfig.getDomain() + localFileUploadConfig.getPrefix() + name;
    }
}