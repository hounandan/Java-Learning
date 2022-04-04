package com.magicwithcode.oop.p1;

public class B1 {

    /*
     * Scope of Access:
     * can access public
     * can access protected - as protected can be accessed inside the package / also inside subclass
     * can access default - as default member can only be accessed within the package
     * but,
     *   Cannot access private member
     *
     * We need to create an object for class A1 to access the members
     */

    public static void main(String[] args) {

        System.out.println(A1.publicMember);
        System.out.println(A1.defaultMember);
        System.out.println(A1.protectedMember);

    }

}
