package com.cervantes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ancervan on 19/06/2018.
 */
public class TetingApp {

    public static void main(String[] args) {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        Map<Character, Integer> map = new HashMap<>();

        for(Character c : (a+b).toCharArray()){
            map.put(c,0);
        }

        for (Character c : a.toCharArray()) {
            map.replace(c, map.get(c).intValue() + 1);
        }

        for (Character c : b.toCharArray()) {

            map.replace(c, map.get(c).intValue() - 1);
        }

        System.out.println(map.values().stream().mapToInt(Integer::intValue).map(Math::abs).sum());

    }


}
