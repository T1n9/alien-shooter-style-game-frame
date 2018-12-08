package com.game.main;

import java.util.Random;

public class Utility {

    public static Random r = new Random();

    static public String get_png(String file_name){
        return "src/resource/" + file_name;
    }


    static public int clamp(int current_value, int max_limit){
        if(current_value <= 0)   return 0;
        else if(current_value >= max_limit)  return max_limit;
        else return current_value;
    }
}
