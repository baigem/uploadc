package cmc.uploadc.exception.file;


import cmc.uploadc.exception.base.BaseException;

/**
 * 文件信息异常类
 *
 * @author 程梦城
 * @version 1.0.0
 * &#064;date  2023/12/13
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
