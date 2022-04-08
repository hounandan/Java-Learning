package com.magicwithcode.absint.basics;

public class ConcreteSubclass extends AbstractSubClass{

    @Override
    public void test2() {
        System.out.println("test 2");
    }

    @Override
    public void test3() {
        System.out.println("test 3");
    }

    public static void main(String[] args) {

        ConcreteSubclass concreteSubclass = new ConcreteSubclass();
        concreteSubclass.test1();
        concreteSubclass.test2();
        concreteSubclass.test3();

    }

}
