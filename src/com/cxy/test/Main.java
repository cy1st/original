package com.cxy.test;

import java.util.*;

/**
 * 测试主方法
 *
 * @author cxy
 * @since 2024/01/02 16:09
 */
public class Main {
    public static void main(String[] args) {
//        String str = "hello123";
//        String s = reverseStr(str);
//        System.out.println(str);
//        System.out.println(s);
//        String trim = str.trim();

        //获取枚举值
        Enums enums = new Enums();
        String[] card = enums.card;
        List<String> cardList = Arrays.asList(card);
        //打乱顺序
        Collections.shuffle(cardList);
        System.out.println(cardList);
        cardList.remove(0);
        System.out.println(cardList);



    }

    /**
     * 反转字符串
     */
    public static String reverseStr(String str) {
        StringBuilder res = new StringBuilder();
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (int i = length - 1; i >= 0; i--) {
            byte aByte = bytes[i];
            char a = (char) aByte;
            res.append(a);
        }
        return res.toString();
    }


    public static ArrayList<String> sendCard(List<String> cardList) {
        if (cardList.size() == 0) {
            System.out.println("数组以为空，无法继续执行！！！");
        }
        ArrayList<String> list = new ArrayList<>();
        //分配
        for (String s : cardList) {
            if (list.size() == 3) break;
            list.add(s);
        }
        return list;
    }

}
