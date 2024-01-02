package com.cxy.io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;

/**
 * 练习IO相关方法及使用
 *
 * @author cxy
 * @since 2023/12/27 09:17
 */
public class IOUtil {
    public static void main(String[] args) {
        String outPath = "D:\\Desktop\\practices\\original\\src\\com\\cxy\\io\\cache\\out.txt";
        String inPath = "D:\\Desktop\\practices\\original\\src\\com\\cxy\\io\\cache\\in.txt";
        inToOutMethod(new File(inPath), new File(outPath));
    }

    public static void outMethod(File f, byte[] b) {
        FileOutputStream fOut = null;
        try {

            fOut = new FileOutputStream(f, true);
            fOut.write(b);
            fOut.flush();
            fOut.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void inToOutMethod(File in, File out) {
        InputStream fIn = null;
        FileOutputStream fOut = null;
        try {
            fIn = Files.newInputStream(in.toPath());
            fOut = new FileOutputStream(out);
            int length = (int) in.length();
            byte[] bytes = new byte[length];
            fIn.read(bytes);
            fOut.write(bytes);
            fOut.flush();
            fOut.close();
            fIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
