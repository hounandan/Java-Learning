package com.magicwithcode.MethodBinding;

public class Staff extends User{

    public int id = 2;
    public void printId(){
        System.out.println("id: "+id);
        System.out.println("Super id: "+ super.id);
    }

    public Staff(){
        userType = "Staff";
    }

    public void printUserType(){
        System.out.println("Staff");
    }

    public Review postAReview(String reviewText){
        System.out.println("Staff: postAReview");
        Review  review = super.postAReview(reviewText);
        review.setApproved(true);
        return review;
    }

    public void instanceMethod(int d){
        System.out.println("Staff: instanceMethod");
    }

    public void instanceMethod(Staff d){
        System.out.println("Staff: instanceMethod");
    }


    public static void staticMethod(){
        System.out.println("Staff: staticMethod");
    }

}
