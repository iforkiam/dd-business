package data.driven.business.common;

/**
 * @author 何晋凯
 * @date 2018/06/05
 */
public class Constant {
    /** redis默认失效时间：半小时 **/
    public final static int REDIS_DEFAULT_EXPIRE_SECONDS = 30 * 60;
    /** 微信获取用户信息时，获取后传入后台的消耗时间最大允许为 3分钟，3分钟后判断该信息为假数据 **/
    public final static int USER_INFO_MAX_INTERVAL = 3 * 60;
    /** 文件上传路径 **/
    public static String FILE_UPLOAD_PATH;
    /** 静态资源访问路径 **/
    public static String STATIC_FILE_PATH = "/static/file/";

    public void setFileUploadPath(String fileUploadPath) {
        FILE_UPLOAD_PATH = fileUploadPath;
    }
}
