package springBootjunit5.myApp.javaToturials;

import java.io.BufferedReader;
import java.io.FileReader;


public class ReadFileJava {

    public static void  main(String[] args)  {

        try {
            // read file
            FileReader fileReader = new FileReader("/Users/hilal/java-interview-preparation/src/main/java/springBootjunit5/myApp/javaToturials/test.txt");
            // turn the file into a buffer
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // we do the reading  and we close it
            String str;
            while((str = bufferedReader.readLine()) != null){
                System.out.println("str ===> "+ str);
                ;
            }
            bufferedReader.close();


        }catch(Exception ex){
            System.out.println(" ex ===>" + ex.getMessage());
            return;
        }


    }




}
