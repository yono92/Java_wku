package com.jwh.ysj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("자바 기초 스터디 시작 ");

        /**
         * COllECTION
         */


        ArrayList<Integer> List1 = new ArrayList<>();


      int[] strarr = {1, 2, 125, 1, 2561, 26, 126, 2}; //array
      ArrayList<Integer> List2 = new ArrayList<>(Arrays.stream(strarr).boxed().collect(Collectors.toList()));
        for (int i = 0; i < strarr.length; i++) {
            System.out.println(strarr[i]);
            List1.add(strarr[i]);
        }
        System.out.println("문자열 배열 :"+strarr.length);
        System.out.println("리스트 1: " + List1);
        System.out.println("리스트 2: " + List2);

        // 리스트 인덱싱하기
        for (int j = 0; j < List2.size(); j++) {
            System.out.println(List2.get(j));
        }

        HashMap<String, String> map = new HashMap<>();
        // Key : value
        // name : yoonsejong
        // age : "31"
        map.put("name", "yoonsejong");
        // case 1
        map.put("age", String.valueOf(11));
        // case 2
        map.put("size", "30");
        System.out.println(map.get("name"));

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        System.out.println(set);
    }
}
