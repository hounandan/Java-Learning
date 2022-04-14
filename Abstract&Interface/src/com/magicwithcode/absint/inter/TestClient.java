package com.magicwithcode.absint.inter;

public class TestClient {

    public static int getVal(){
        return 42;
    }

    public static void main(String... args){

        C c = new X();
        c.foo();
        c.bar();

        C clone = ((X)c).clone();
        if(clone != c){
            System.out.println("Clone Created");
        }

        /*
        * Let's take a scenario here.
        * Interface C is owned by ABC
        * Class X implements C - Class X is owned by XYZ
        *
        * User uses the X class in TestClient
        * Now, as C has introduced an extra method go() - X is pushed to provide an implementation - which is an headache
        * when comes to a big change.
        *
        * Solution:
        * Use default methods in interface - so that you don't have to provide implementation in the implemented classes
        *
         */
        c.go();

        /*
        * Scenario 2:
        * Let's have a diamond problem here
        * Interface B also defines a new go method as a default method.
        * If so, X can't actually invoke go method as both C and B interface have 2 different interfaces
        *
        * Solution:
        * Provide a distinct implementation in Class X - with public access modifier
         */


        /*
        * Scenario 3:
        * Consider the go method is declared in an interface as a default method and also in a superclass as abstract method
        * Now,
        * If we define a class - extend the super class and implement the interface:
        * The method implementation in superclass will be given priority
        *
        * If you want to force the method implementation in interface :
        * you can do it this way.
        * C.super.go();
         */




    }

}
