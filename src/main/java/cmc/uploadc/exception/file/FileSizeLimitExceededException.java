package cmc.uploadc.exception.file;

/**
 * 文件名大小限制异常类
 *
 * @author 程梦城
 * @version 1.0.0
 * &#064;date  2023/12/13
 */
public class FileSizeLimitExceededException extends FileException
{
    private static final long serialVersionUID = 1L;

    public FileSizeLimitExceededException(long defaultMaxSize)
    {
        super("upload.exceed.maxSize", new Object[] { defaultMaxSize });
    }
}
