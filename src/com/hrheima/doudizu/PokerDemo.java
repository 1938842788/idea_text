package com.hrheima.doudizu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
//♠ ♣ ♥ ♦
        String[] colors = {"♠", "♣", "♥", "♦"};
        String[] number = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String colors1 : colors) {
            for (String number1 : number) {
                array.add(colors1 + number1);
            }
        }
        array.add("大王");
        array.add("小王");
        Collections.shuffle(array);
        System.out.println(array);
        ArrayList<String> lqxArray = new ArrayList<>();
        ArrayList<String> lyArray = new ArrayList<>();
        ArrayList<String> fqyArray = new ArrayList<>();
        ArrayList<String> dpArray = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                dpArray.add(poker);
            } else if (i % 3 == 0) {
                lqxArray.add(poker);

            } else if (i % 3 == 1) {
                lyArray.add(poker);
            } else if (i % 3 == 2) {
                fqyArray.add(poker);
            }
        }
        getpoker("林青霞", lqxArray);
        getpoker("柳岩", lyArray);
        getpoker("风清扬", fqyArray);
        getpoker("底牌", dpArray);

    }

    public static void getpoker(String name, ArrayList<String> arr) {
        Collections.sort(arr);
        System.out.println(name + "的牌是:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
