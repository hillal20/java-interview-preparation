package springBootjunit5.myApp.javaToturials;
import java.io.*;


public class WriteFilesJava {


    public static void  main(String[] args)  {

        try {
            // write  file
            FileWriter fileWriter = new FileWriter("/Users/hilal/java-interview-preparation/src/main/java/springBootjunit5/myApp/javaToturials/test.txt");
            // turn the file into a buffer
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // we do the writing and we close it
            bufferedWriter.write("hello word ");
            bufferedWriter.close();


        }catch(Exception ex){
            System.out.println(" ex ===>" + ex.getMessage());
            return;
        }


    }

}
