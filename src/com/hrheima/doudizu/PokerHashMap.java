package com.hrheima.doudizu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♠ ", "♣", "♥", "♦"};
        int index = 0;
        for (String number1 : number) {
            for (String colors1 : colors) {
                hm.put(index, colors1 + number1);
                array.add(index);
                index++;
            }
        }
        hm.put(53, "小王");
        hm.put(54, "大王");
        array.add(53);
        array.add(54);
        System.out.println(array);
        Collections.shuffle(array);
        System.out.println(array);
        TreeSet<Integer> lqx = new TreeSet<>();
        TreeSet<Integer> zmy = new TreeSet<>();
        TreeSet<Integer> fqy = new TreeSet<>();
        TreeSet<Integer> dp = new TreeSet<>();
        for (int i = 0; i < array.size(); i++) {
            Integer integer = array.get(i);
            if (i >= array.size() - 3) {
                dp.add(integer);
            } else if (i % 3 == 0) {
                lqx.add(integer);
            } else if (i % 3 == 1) {
                zmy.add(integer);
            } else if (i % 3 == 2) {
                fqy.add(integer);
            }
        }
        getpoker("林青霞", lqx, hm);
        getpoker("张曼玉", zmy, hm);
        getpoker("风青扬", fqy, hm);
        getpoker("底牌", dp, hm);

    }

    public static void getpoker(String name, TreeSet<Integer> arr, HashMap<Integer, String> hm) {
        System.out.print(name + "的牌是");
        for (Integer i : arr) {
            String s = hm.get(i);
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
