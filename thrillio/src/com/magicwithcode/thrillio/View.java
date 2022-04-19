package com.magicwithcode.thrillio;

import com.magicwithcode.thrillio.controllers.BookmarkController;
import com.magicwithcode.thrillio.entities.Bookmark;
import com.magicwithcode.thrillio.entities.User;

public class View {

    public static void bookmark(User user, Bookmark[][] bookmarks){

        System.out.println("\n" + user.getEmail()+ " is bookmarking");
        for(int i=0; i< DataStore.USER_BOOKMARK_LIMIT; i++){
            int typeOffset = (int)(Math.random() * DataStore.BOOKMARK_TYPES_COUNT); // return a random number b/w 0 to 3
            int bookmarkOffset = (int)(Math.random() * DataStore.BOOKMARK_COUNT_PER_TYPE);// return a random number b/w 0 to 5

            Bookmark bookmark = bookmarks[typeOffset][bookmarkOffset];

            BookmarkController.getInstance().saveUserBookmark(user, bookmark);

            System.out.println(bookmark);
        }

    }

}
