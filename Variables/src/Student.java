
public class Student {


    public static void main(String[] args) {

        char myChar = 'A';
        char charByInt = 65;
        char charByUnicode = '\u0041';

        System.out.println("As Char = "+myChar);
        System.out.println("As Int  = "+charByInt);
        System.out.println("As Uni  = "+charByUnicode);

        /*
        Please refer "unicode-table.com" to view the reserved character for alphabets
        for all languages, emoji and symbols.
         */

        char myUnicode1 = '\u0BA8';
        char myUnicode2 = '\u0BA9';
        char myUnicode3 = '\u0BCD';
        char myUnicode4 = '\u0BA4';
        char myUnicode5 = '\u0BA9';
        char myUnicode6 = '\u0BCD';
        char myUnicode7 = '\u0BB9';
        char myUnicode8 = '\u0B6D';

        System.out.print("Hounandan in Tamil  = ");
        System.out.print(myUnicode7);
        System.out.print(myUnicode8);
        System.out.print(myUnicode1);
        System.out.print(myUnicode2);
        System.out.print(myUnicode3);
        System.out.print(myUnicode4);
        System.out.print(myUnicode5);
        System.out.println(myUnicode6);

    }

}
