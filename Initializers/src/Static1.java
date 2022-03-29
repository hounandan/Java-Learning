import java.io.File;
import java.io.IOException;

public class Static1 {

    private static File file;

    static {
        System.out.println("Static 1 Initializer - Start");
        file = new File("/home/hounandan/Desktop/test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Static 1 Initializer - End");
    }

    public static void listFileName(){
        System.out.println(file.getName());
        System.out.println();
    }

}
