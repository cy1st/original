package com.cxy.string;

import java.io.File;

/**
 * 常用的字符串处理工具
 *
 * @author cxy
 * @since 2023/12/26 15:27
 */
public class StringUtils {

    public static void main(String[] args) {
        String path = "C:\\Users\\antu\\Downloads\\Coodesker-x64_1.0.4.1.exe";
        SplitFilePath p = SplitFilePath.newInstance(path);
        String path1 = "C:\\Users\\antu\\Downloads\\test.txt.txt";
        SplitFilePath p1 = SplitFilePath.newInstance(path1);
        System.out.println("...");
    }
}
