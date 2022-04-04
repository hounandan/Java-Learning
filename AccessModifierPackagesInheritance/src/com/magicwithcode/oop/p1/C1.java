package com.magicwithcode.oop.p1;

public class C1 extends A1{

    /*
    * Scope of Access:
    * can access public
    * can access protected - as protected can be accessed inside the package / also inside subclass
    * can access default - as default member can only be accessed within the package
    * but,
    *   Cannot access private member
    *
    * Note:
    *   # need not to create object for class A1
    *   # As the C1 is inherited from A1
     */

    public static void main(String[] args) {

        System.out.println(publicMember);
        System.out.println(defaultMember);
        System.out.println(protectedMember);
        //System.out.println(privateMember);

    }

}
