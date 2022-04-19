package com.magicwithcode.thrillio.managers;

import com.magicwithcode.thrillio.dao.BookmarkDao;
import com.magicwithcode.thrillio.entities.*;

public class BookmarkManager {

    private static BookmarkManager bookmarkManager = null;
    private static BookmarkDao dao = new BookmarkDao();

    private BookmarkManager(){

    }

    public static BookmarkManager getInstance(){
        if(null == bookmarkManager){
            return new BookmarkManager();
        }
        return bookmarkManager;
    }

    public Movie createMovie(long id, String title, String profileUrl,
                             int releaseYear, String[] cast, String[] directors,
                             String genre, double imbdRating){

        Movie movie = new Movie();
        movie.setId(id);
        movie.setTitle(title);
        movie.setProfileUrl(profileUrl);
        movie.setReleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imbdRating);

        return movie;

    }

    public Book createBook(long id, String title, String profileUrl,
                           int publicationYear, String publisher,
                           String[] authors, String genre, double amazonRating){

        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setProfileUrl(profileUrl);
        book.setPublicationYear(publicationYear);
        book.setPublisher(publisher);
        book.setAuthors(authors);
        book.setGenre(genre);
        book.setAmazonRating(amazonRating);

        return book;

    }

    public WebLink createWebLink(long id, String title,
                                 String url, String host){

        WebLink webLink = new WebLink();
        webLink.setId(id);
        webLink.setTitle(title);
        webLink.setUrl(url);
        webLink.setHost(host);

        return webLink;
    }

    public Bookmark[][] getBookmarks(){
        return dao.getBookmarks();
    }


    public void saveUserBookmark(User user, Bookmark bookmark) {

        UserBookMark userBookMark = new UserBookMark();
        userBookMark.setUser(user);
        userBookMark.setBookmark(bookmark);

        dao.saveUserBookmark(userBookMark);


    }
}
