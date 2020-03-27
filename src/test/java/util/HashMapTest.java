package test.java.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");

        List<String> ls = Arrays.asList("hello", "world", "!");
        List<Integer> li1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> li2 = new ArrayList<>();
        List<Integer> li3 = new ArrayList<>();
        Map<String, List<Integer>> maps = new HashMap<>();
//        ls.forEach(System.out::println);
        ls.forEach(i -> {
            System.out.println(i);
        });
        for (Integer integer : li1) {
            if (integer > 3) {
                li3.add(integer);
            } else {
                li2.add(integer);
            }
            maps.put("大于3", li3);
            maps.put("小于等于3", li2);
        }
        System.out.println("maps的结果：" + maps.toString());
        maps.forEach((k, v) -> {
            System.out.println("========");
            System.out.println(v);
        });
    }

}
