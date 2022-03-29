import java.util.HashMap;

public class Static {

    private static HashMap map = new HashMap<>();

    static {
        System.out.println("Static Initializer - Start");
        map.put(1, "Hello");
        map.put(2, "world");
        System.out.println("Static Initializer - End");

    }

    public static void listFileds(){
        for(Object s : map.values()){
            System.out.println(s);
        }
        System.out.println();
    }

}
