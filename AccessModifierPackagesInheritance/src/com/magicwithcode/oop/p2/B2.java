package com.magicwithcode.oop.p2;

import com.magicwithcode.oop.p1.A1;
import com.magicwithcode.oop.p1.C1;

public class B2 {

    /*
     * Scope of Access:
     * can only access public
     *
     * but,
     *   Cannot access private member
     *   Cannot access default member - as the default member can only be accessed with the package
     *   Cannot access protected member - as the class is not in the same package and also it has
     *          not extended class A1
     *
     *
     */

    public static void main(String[] args) {

        System.out.println(A1.publicMember);
//        System.out.println(A1.privateMember);
//        System.out.println(A1.defaultMember);
//        System.out.println(A1.protectedMember);

        System.out.println(C1.publicMember);

        // Also, it can access A1's public member via C1 - as C1 has extended A1


    }

}
