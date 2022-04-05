package com.magicwithcode.polymorphism;

public class Main {

    public void printUserType(User user){
        user.printUserType();
    }

    public static void main(String[] args) {

        User user = new User();
        User staff = new Staff();
        User editor = new Editor();

        /*
        * Now, we are going to create an object for Main class
        * And, we are going to pass user, staff and editor object references
        *
        * We expect - the corresponding object referece (staff, editor and user) to invoke its own method
        * declaration.
         */

        Main m = new Main();
        m.printUserType(user);
        m.printUserType(staff);
        m.printUserType(editor);


        //editor.approveReview(); // This cannot be done - cause' user class have no method approveReview()

        editor.postAReview(); // Straight forward - the jvm climb the Inheritance tree from the object type (new Editor())

        editor.saveWebLink();   // goes up the inheritance tree and finds saveWebLink() @ User class.
                                // again it encounters postAReview()
                                // but it will not use the method present in User class
                                // Rather, it again comes to the object references pass and again starts
                                // climbing up the inheritance tree and find it in Staff class

    }

}
