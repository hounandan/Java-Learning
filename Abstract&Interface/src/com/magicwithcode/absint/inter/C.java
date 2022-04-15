package com.magicwithcode.absint.inter;

public interface C extends A{

    void fooBar();

    default void go(){
        System.out.printf("C: go");
        staticMethod();
    }

    static void staticMethod(){
        System.out.printf("C: staticMethod");
    }
}
