package org.example.cards;

import java.util.*;

public class StringExercise {


    static int[][] list1 = {{1,2,3},{4,5,6},{7, 8,9}};

    public static void listLoop(){
        for (int i[] : list1){
            for (int j : i){
                System.out.println(j);
            }
        };
    }

    static HashSet<String> hashSet1 = new HashSet<>();

    public static void hashLoop(){
        hashSet1.add("abc");
        hashSet1.add("def");
        hashSet1.add("ghi");

        for (String i : hashSet1){
            System.out.println(i);
        }
    }

    static HashMap<Integer,String> map1 = new HashMap<Integer, String>();

    public static void mapLoop(){
        map1.put(1,"apple");
        map1.put(2,"banana");
        map1.put(3,"candy");

        for (Map.Entry<Integer,String> i: map1.entrySet()){
            System.out.println(i.getKey() + '='+ i.getValue() );
        }
    }

    public static void builder(){
        String str1 = "Hello";
        String str2 = "World";

        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);

        System.out.println(sb);
    }





    public static void main(String[] args) {
        hashLoop();
        listLoop();
        mapLoop();
        builder();

    }
}
