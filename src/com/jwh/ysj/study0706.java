package com.jwh.ysj;

import java.util.*;

public class study0706 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(6126);
        list.add(65126126);
        list.add(123);
        System.out.println(list);

        Map<String, Integer> map = new HashMap<>();
        map.put("정영환", 26);
        map.put("윤세종", 31);

        String line = "Test 15 lqlq 35 bad 99999 guess 34";
        int sum = Arrays.stream(line.split(" ")).filter((s) -> s.matches("\\b+")).mapToInt(Integer::parseInt).sum();




    }
}
