package cmc.uploadc.exception.file;

/**
 * 文件名称超长限制异常类
 *
 * @author 程梦城
 * @version 1.0.0
 * &#064;date  2023/12/13
 */
public class FileNameLengthLimitExceededException extends FileException
{
    private static final long serialVersionUID = 1L;

    public FileNameLengthLimitExceededException(int defaultFileNameLength)
    {
        super("upload.filename.exceed.length", new Object[] { defaultFileNameLength });
    }
}
