package com.cervantes;

import java.util.Comparator;

/**
 * Created by ancervan on 25/06/2018.
 */
public class Checker implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        if(p1.score==p2.score){
            return p1.name.compareTo(p2.name);
        }
        if(p1.score>p2.score){
            return -1;
        }else{
            return 1;
        }
    }

}
