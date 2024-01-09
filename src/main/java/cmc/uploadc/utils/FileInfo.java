package cmc.uploadc.utils;


import lombok.Data;

/**
 * 文件信息
 * 
 * @author ruoyi
 */
@Data
public class FileInfo
{
    /**
     * 文件名称
     */
    private String name;

    /**
     * 原始名称
     */
    private String originalName;

    /**
     * 文件地址
     */
    private String url;
}
