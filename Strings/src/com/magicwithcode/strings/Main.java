package com.magicwithcode.strings;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String s = "hello world!";

        System.out.println(s);
        System.out.println(""+s.length());
        System.out.println(""+s.isEmpty());
        System.out.println(""+s.equals("HELLO WORLD!"));
        System.out.println(""+s.equalsIgnoreCase("HELLO WORLD!"));
        System.out.println(""+s.compareTo("HELLO WORLD!"));
        System.out.println(""+s.contains("HELLO WORLD!"));
        System.out.println(""+s.contains("world"));
        System.out.println(""+s.startsWith("HELLO WORLD!"));
        System.out.println(""+s.startsWith("hello"));
        System.out.println(""+s.endsWith("!"));
        System.out.println(""+s.indexOf("lo"));
        System.out.println(""+s.indexOf("o"));
        System.out.println(""+s.lastIndexOf("o"));
        System.out.println(""+s.charAt(4));
        System.out.println(""+s.substring(4));
        System.out.println(""+s.substring(4, 9));
        System.out.println(""+s.toUpperCase());
        System.out.println(""+s.toLowerCase());
        System.out.println(""+s.trim());
        System.out.println(""+String.valueOf(1.3d));

        String[] sa = s.split("o");
        for(String a: sa){
            System.out.println(a);
        }


    }

}
