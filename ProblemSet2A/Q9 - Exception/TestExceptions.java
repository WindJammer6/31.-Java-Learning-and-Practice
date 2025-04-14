import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestExceptions {

    public static void main(String[] args) {
        System.out.println( readFileByLineOne("apple"));
        try{
            System.out.println( readFileByLineTwo("orange"));
            System.out.println( readFileByLineTwo("apple"));
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        /* You should see this: 
        apple (No such file or directory)
        africanorangevalenciaorange
        java.io.FileNotFoundException: apple (No such file or directory)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
        at java.base/java.util.Scanner.<init>(Scanner.java:645)
        at TestExceptions.readFileByLineTwo(TestExceptions.java:38)
        at TestExceptions.main(TestExceptions.java:11) */

    }

    /* put a try-catch block in this method at the appropriate location
     * in the catch block, return the output of the getMessage() method of the exception object
     */
    public static String readFileByLineOne(String filename){
        File file = new File(filename);
        String out = "";

        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                out = out + scanner.next();
            }
            scanner.close();

        }catch( FileNotFoundException ex){
            ex.printStackTrace(); // get all the error messages
            return ex.getMessage(); // get just “Message"
        }

        return out;
    }

    /* simply modify the method signature to declare that a specific checked exception is thrown*/
    public static String readFileByLineTwo (String filename) throws FileNotFoundException{
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        String out = "";
        while(scanner.hasNext()){
            out = out + scanner.next();
        }
        scanner.close();
        return out;
    }


}
