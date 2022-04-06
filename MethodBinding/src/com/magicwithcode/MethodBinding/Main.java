package com.magicwithcode.MethodBinding;

public class Main {

    public static void main(String[] args) {

        User staff = new Staff();
//        staff.staticMethod();
//        staff.postAReview("");

//        staff.instanceMethod(10);
        staff.instanceMethod(new Staff());

    }

}
