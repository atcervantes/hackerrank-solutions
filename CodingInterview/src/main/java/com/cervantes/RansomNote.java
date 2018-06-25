package com.cervantes;

import java.util.Hashtable;

/**
 * Created by ancervan on 19/06/2018.
 */
public class RansomNote {


    public static void main(String[] args) {
        String [] magazine = {"apgo","clm","w","lxkvg","mwz","elo","bg","elo","lxkvg","elo","apgo","apgo","w","elo","bg"};
        String [] note = {"elo","lxkvg","bg","mwz","clm","w"};



        Hashtable<String, Integer> dictionary = new Hashtable<>();

//        for (String word: magazine) {
//            dictionary.put(word, 0);
//        }
        for (String word: note) {
            if(dictionary.containsKey(word)){
                dictionary.replace(word, dictionary.get(word).intValue(), dictionary.get(word).intValue()+1);
            }else{
                dictionary.put(word, 1);
            }

        }

        for(String word : magazine){
            if(dictionary.containsKey(word) && dictionary.get(word).intValue() > 0){

                dictionary.replace(word, dictionary.get(word).intValue(), dictionary.get(word).intValue()-1);
            }
        }

        String response;

        if(dictionary.values().stream().mapToInt(Integer::intValue).sum()!=0){
            response = "No";
        }else{
            response = "Yes";
        }


        System.out.println(dictionary);
        System.out.println(response);

    }

}
