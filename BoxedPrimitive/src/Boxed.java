import java.util.ArrayList;

public class Boxed {


    public void printBoxedPrimitives(){

        // Wrapping
        Integer boxedInt = Integer.valueOf(25); // always use static factory method
        Double boxedDouble = Double.valueOf(45.6);
        Character boxedChar = Character.valueOf('n');

        System.out.println("Boxed: ");
        System.out.println(boxedInt);
        System.out.println(boxedDouble);
        System.out.println(boxedChar);

        /**
         * Integer boxedInt = new Integer(25);
         * This is not recommended as the static factory method has more time & memory optimized
         *
         * Integer boxedInt = Integer.valueOf("eight");
         * This is Invalid as the argument passed to valueOf() must be a integer literal
         */

        //Valid
        Integer boxedInt1 = Integer.valueOf("35");

        // Un-Wrapping
        int primitiveInt = boxedInt.intValue();
        double primitiveDouble = boxedDouble.doubleValue();
        char primitiveChar = boxedChar.charValue();

        System.out.println("Primitives: ");
        System.out.println(primitiveInt);
        System.out.println(primitiveDouble);
        System.out.println(primitiveChar);
    }

    public void parsing(){

        String data = "5001 DaVinciCode 2005 C 8.9";
        String[] datum = data.split(" ");


        // Primitive parsing
        long id = Long.parseLong(datum[0]);
        String title = datum[1];
        int year = Integer.parseInt(datum[2]);
        char genre = datum[3].charAt(0);
        double rating = Double.parseDouble(datum[4]);

        System.out.println("Primitive Parsing");
        System.out.println(id);
        System.out.println(title);
        System.out.println(year);
        System.out.println(genre);
        System.out.println(rating);


        // Boxed parsing
        Long id1 = Long.valueOf(datum[0]);
        Integer year1 = Integer.valueOf(datum[2]);
        Character genre1 = Character.valueOf(datum[3].charAt(0));
        Double rating1 = Double.valueOf(datum[4]);

        System.out.println("Boxed Parsing");
        System.out.println(id1);
        System.out.println(year1);
        System.out.println(genre1);
        System.out.println(rating1);
    }


    public void utilityMethods(){

        char genre = 'C';

        boolean isLetter = Character.isLetter(genre);
        boolean isDigit = Character.isDigit(genre);
        boolean isLetterOrDigit = Character.isLetterOrDigit(genre);
        boolean isUpperCase = Character.isUpperCase(genre);

        System.out.println("Character Utility:");
        System.out.println(isLetter);
        System.out.println(isDigit);
        System.out.println(isLetterOrDigit);
        System.out.println(isUpperCase);

        boolean isNan = Double.isNaN(0.00/0.00);
        System.out.println("Double Utility:");
        System.out.println(isNan);

        String binary = Integer.toBinaryString(25);
        String yearAsString = Integer.toString(2005);
        System.out.println("Integer Utility:");
        System.out.println(binary);
        System.out.println(yearAsString);
    }

    public void dataStructures(){

        /**
         * For storing data in data-structures - it won't accept primitive types.
         * It only accepts object references as input
         */
        ArrayList idList = new ArrayList();
        idList.add(Long.valueOf(5001L));
        idList.add(5001L); // This can be done. Introduced from Java5 - Called AutoBoxing


        // Generics - parameterized types
        ArrayList<Double> ratingList = new ArrayList<>();
        //ratingList.add(6);

        /**
         *Above, the arrayList only accepts Objects of double - that is boxed primitive Double.
         * We can't simply expect it to accept primitive types
         */

    }

}
