import java.io.File;
import java.io.IOException;

public class Static2 {

    private static File file = getFile();

    private static File getFile(){
        System.out.println("Static 2 Initializer - Start");

        File file = new File("/home/hounandan/Desktop/test.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Static 2 Initializer - End");
        return file;
    }

    public static void listFileName(){
        System.out.println(file.getName());
        System.out.println();
    }


}
