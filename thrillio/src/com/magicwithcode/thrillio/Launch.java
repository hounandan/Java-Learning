package com.magicwithcode.thrillio;

import com.magicwithcode.thrillio.entities.Bookmark;
import com.magicwithcode.thrillio.entities.User;
import com.magicwithcode.thrillio.managers.BookmarkManager;
import com.magicwithcode.thrillio.managers.UserManager;

public class Launch {

    private static User[] users;
    private static Bookmark[][] bookmarks;

    private static void loadData(){

        System.out.printf("1. Loading Data ...");
        DataStore.loadData();

        users = UserManager.getInstance().getUsers();
        bookmarks = BookmarkManager.getInstance().getBookmarks();

//        System.out.println("Printing data ...");
//        printUserData();
//        printBookmarkData();


    }


    private static void printUserData() {
        for(User user: users){
            System.out.println(user);
        }
    }


    private static void printBookmarkData() {

        for(Bookmark[] bookmarkList: bookmarks){
            for(Bookmark bookmark: bookmarkList){
                System.out.println(bookmark);
            }
        }

    }

    private static void start(){
        //System.out.println("\n2. Bookmarking ...");
        for(User user: users){
            View.browse(user, bookmarks);
        }
    }


    public static void main(String[] args) {
        loadData();
        start();
    }

}
