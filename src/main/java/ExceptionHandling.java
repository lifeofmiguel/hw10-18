import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        //createNewFile();
        numbersExceptionHandling();
        createNewFileRethrow();

    }

    private static void createNewFile() {
        File file = new File("resource/nonexistent");
        try{   //try this code
            file.createNewFile();
        }catch (IOException e){  //if fails catch the error
            System.out.println("dpes not exist");// do this if it fails
            e.printStackTrace();
        }
    }

    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try{   //try(Scanner fileReader = new Scanner(file)){}
            fileReader = new Scanner(file);

            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        // CATCH AL {Lcatch (Exception e)}
    }finally {
            fileReader.close();
        }
    }

    public static void createNewFileRethrow()throws IOException{
        File file = new File("resource/nonexistent.txt");
        file.createNewFile();
    }

    public static void numberExceptionHandling(){

    }
}
