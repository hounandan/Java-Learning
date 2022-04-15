package com.magicwithcode.absint.inter;

public class X extends AbstractA implements A,B,C, Cloneable{

    public void foo() {
        System.out.println("X: foo");
        System.out.println("Val: "+B.VAL);
    }

    public void fooBar(){
        System.out.println("X: fooBar");
    }

    public C clone(){

        try{
            return (C)super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("Error while Cloning : "+e.getMessage());
        }
        return null;
    }

//    public void go(){
//        System.out.printf("X: go");
//    }

    public void inheritanceTest(){

        go(); // calls the go method in the interface C

        //staticMethod(); // Will not work as static methods in interface is not inherited

    }

}
