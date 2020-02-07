package Classes;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author RR
 */
public class FileManager {    
    public void registerUser(String UserName, String SureName, String PersCode, String Country, String DocNo, String Phone){
        File file = new File("data.txt");
        try{
            file.createNewFile();
            System.out.println(file.getAbsoluteFile());
        }catch(Exception ex){
            System.out.println("Nogaja greizi " + ex.getMessage());
        }
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file,true)); // seit true noradam, ja gribam pievienot faila gala, false, ja negribam pievienot
            bw.write(UserName +" "+ SureName);
            bw.newLine();
            bw.write(PersCode);
            bw.newLine();
            bw.write(Country);
            bw.newLine();
            bw.write(DocNo);
            bw.newLine();
            bw.write(Phone);
            bw.newLine();
            bw.close();
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        } 
    }
}
