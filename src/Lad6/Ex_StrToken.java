package Lad6;

import java.util.StringTokenizer;

public class Ex_StrToken {
    public static void main(String[] args){


        String msg ="In the desire to prove to him his mistake," +
                " his Mother placed before him a few grains of frankincense, and asked, " +
                "“What is it?” " +
                "The young Mole said, “It is a pebble.”" +
                " His Mother exclaimed: “My son, " +
                "I am afraid that you are not only blind, " +
                "but that you have lost your sense of smell.”";

        System.out.println(msg.length());
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens()); //return word count as integer


        while (myToken.hasMoreElements()){
            System.out.println(myToken.nextElement());
        }
    }











}
