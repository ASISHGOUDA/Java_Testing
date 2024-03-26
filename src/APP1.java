import java.io.File;

public class APP1 {
public static void main(String[] args) {
    //Example of checked Exception
    File file = new File("c:\\random.txt");
    try {
        FileReader fileReader = new FileReader(file);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }



    //Example of run time exception
    Integer[] arr = {1,2,3};
    try {
        System.out.println(arr[3]);
    } catch (Exception e) {
        System.out.println("This is an exception caught");
    }
    finally {
        System.out.println("finally printed");
    }

}

}