package com.magicwithcode.absint.inter;

public class TestClient {

    public static int getVal(){
        return 42;
    }

    public static void main(String... args){

        A a = new X();
        a.foo();
        a.bar();

        C clone = ((X)a).clone();
        if(clone != a){
            System.out.println("Clone Created");
        }


    }

}
