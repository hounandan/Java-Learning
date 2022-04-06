package com.magicwithcode.polymorphism;

public class Staff extends User{

    public int id = 2;
    public void printId(){
        System.out.println("id: "+id);
        System.out.println("Super id: "+ super.id);
    }

    public void printUserType(){
        System.out.println("Staff");
    }

    public Review postAReview(String reviewText){
        System.out.println("Staff: postAReview");
        Review  review = super.postAReview(reviewText);
        review.setApprove(true);
        return review;
    }

}
