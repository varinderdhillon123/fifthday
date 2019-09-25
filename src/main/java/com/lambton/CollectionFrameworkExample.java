package com.lambton;

import java.util.*;

public class CollectionFrameworkExample {
    public static void main(String[] args) {
        ArrayList<String> mStringArrayList = new ArrayList<>();

        mStringArrayList.add("A");
        mStringArrayList.add("B");
        mStringArrayList.add("C");
        mStringArrayList.add("D");

        mStringArrayList.add("A");
        mStringArrayList.add("A");
        mStringArrayList.add("C");

        //System.out.println(mStringArrayList);


        int i;
        for (i = 0; i <= mStringArrayList.size() - 1; i++) {
            //System.out.println(mStringArrayList.get(i));
        }

        for (String s :mStringArrayList)
        {
            //System.out.println(s);
        }

        Set<String> mySet = new HashSet<>();

        mySet.add("India");
        mySet.add("Canada");
        mySet.add("America");
        mySet.add("Australia");

        System.out.println(mySet);
        mySet.add("India");
        System.out.println(mySet);


        Map<String ,String>stringMap = new HashMap<>();
        /*stringMap.put("IND", "India");
        stringMap.put("CAD", "Canada");
        stringMap.put("AMR", "Americaa");
        stringMap.put("AUS", "Pakistan");
        System.out.println(stringMap);

        stringMap.put("CAD", "New Canada");
        System.out.println(stringMap);*/

        HashMap<String, String> stringArrayListMap= new HashMap<>();
        stringMap.put("IND", "Punjab, Amritsar, Jalandhar,HimachalPradesh " );
        stringMap.put("CAD", "Ontario , Surrey ,Quebec");
        System.out.println(stringMap);

































    }
}
