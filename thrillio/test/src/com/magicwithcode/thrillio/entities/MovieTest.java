package com.magicwithcode.thrillio.entities;

import com.magicwithcode.thrillio.constants.MovieGenre;
import com.magicwithcode.thrillio.managers.BookmarkManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void isKidFriendlyEligible() {

        // Test 1 -- genre has horror - false

        Movie movie = BookmarkManager.getInstance().createMovie(
                3000, 	"Citizen Kane","",	1941, new String[]{"Orson Welles","Joseph Cotten"},new String[]{"Orson Welles"}, MovieGenre.HORROR,	8.5
        );

        boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();

        assertFalse(isKidFriendlyEligible, "For Horror Genre - isKidFriendlyEligible() should return false");

        // Test 2 -- genre has thriller - false

        movie = BookmarkManager.getInstance().createMovie(
                3000, 	"Citizen Kane","",	1941, new String[]{"Orson Welles","Joseph Cotten"},new String[]{"Orson Welles"}, MovieGenre.THRILLERS,	8.5
        );

        isKidFriendlyEligible = movie.isKidFriendlyEligible();

        assertFalse(isKidFriendlyEligible, "For Thrillers Genre - isKidFriendlyEligible() should return false");


    }
}