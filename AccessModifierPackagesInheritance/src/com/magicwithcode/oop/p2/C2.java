package com.magicwithcode.oop.p2;

import com.magicwithcode.oop.p1.A1;

public class C2 extends A1 {

    /*
     * Scope of Access:
     * can access public
     * can access protected - as protected can be accessed inside the package / also inside subclass
     *
     * but,
     *   Cannot access private member
     *   Cannot access default member - as the default member can only be accessed with the package
     *
     *
     */

    public static void main(String[] args) {


        System.out.println(publicMember);
        System.out.println(protectedMember);

        //System.out.println(defaultMember);
        //System.out.println(privateMember);

    }


}
