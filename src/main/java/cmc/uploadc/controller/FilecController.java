package cmc.uploadc.controller;

import cmc.uploadc.service.FileService;
import cmc.uploadc.utils.FileInfo;
import cmc.uploadc.utils.FileUtils;
import cmc.uploadc.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件请求处理
 *
 * @author 程梦城
 * @version 1.0.0
 * &#064;date  2023/12/13
 */
@RestController
public class FilecController {
    private static final Logger log = LoggerFactory.getLogger(FilecController.class);

    @Autowired
    private FileService sysFileService;

    /**
     * 文件上传请求
     */
    @PostMapping("upload")
    public R<FileInfo> upload(MultipartFile file) {
        try {
            // 上传并返回访问地址
            String url = sysFileService.uploadFile(file);
            FileInfo sysFile = new FileInfo();
            sysFile.setName(FileUtils.getName(url));
            sysFile.setOriginalName(file.getOriginalFilename());
            sysFile.setUrl(url);
            return R.ok(sysFile);
        } catch (Exception e) {
            log.error("上传文件失败", e);
            return R.fail(e.getMessage());
        }
    }
}