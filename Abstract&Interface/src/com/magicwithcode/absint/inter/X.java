package com.magicwithcode.absint.inter;

public class X extends AbstractA implements A,B,C{

    public void foo() {
        System.out.println("X: foo");
        System.out.println("Val: "+B.VAL);
    }

    public void fooBar(){
        System.out.println("X: fooBar");
    }

}
