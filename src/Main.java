import java.util.*;

/**
 * 该项目为基于jdk1.8为基础，进行基础编码练习
 *
 * @author cxy
 * @since 2023/12/26 15:19
 */
public class Main {
    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("1", "hello");
//        map.put("2", "heihei");
//        Set<String> keySet = map.keySet();
//        Set<Map.Entry<String, String>> entrySet = map.entrySet();
//        Collection<String> values = map.values();
//        Object[] array = values.toArray();
//        System.out.println(array[1]);
//        for (String value : values) {
//            System.out.printf("==>%s\n",value);
//        }
//        for (Map.Entry<String, String> entry : entrySet) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.printf("%s=%s\n", key, value);
//        }

        String str = "antu";
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            System.out.printf("%s=>%s\n", aChar, (int) aChar);
        }
        byte[] bytes = str.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

    }
}
