package com.cxy.string;

import java.io.File;

/**
 * 用于对文件绝对路径进行分割的类
 *
 * @author cxy
 * @since 2023/12/26 17:05
 */
public class SplitFilePath {
    private final static String symbol = ".";
    private final String path;
    private String suffix;
    private String fileFullName;
    private String fileName;

    private SplitFilePath(String path) {
        checkString(path);
        this.path = path;
        initParam();
    }

    public static SplitFilePath newInstance(String path) {
        return new SplitFilePath(path);
    }

    private void initParam() {
        this.fileFullName =  path.substring(path.lastIndexOf(File.separator) + 1);
        this.suffix = fileFullName.substring(fileFullName.lastIndexOf(symbol) + 1);
        this.fileName = fileFullName.substring(0, fileFullName.lastIndexOf(symbol));
    }

    public static void checkString(String path) {
        if (path == null) throw new RuntimeException("path is null!");
        path = path.trim();
        if (path.equals("")) throw new RuntimeException("path is empty!");
    }

    public String getPath() {
        return path;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getFileFullName() {
        return fileFullName;
    }

    public String getFileName() {
        return fileName;
    }
}
