/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;

/**
 *
 * @author Hp
 */
public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("person");
        dir.mkdir();
        String path = dir.getAbsolutePath();
        
        File file1 = new File(path+ "/student.txt");//file created person folder
        File file2 = new File(path+ "/teacher.txt");
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("file are created");
        }catch(Exception e){
            System.out.println(e);
        }
        if(file1.exists())
        {
            System.out.println("File exists"); 
        }
        file2.delete();
       if(file2.exists())
        {
            System.out.println("File exists"); 
        }
        
       else{
           System.out.println("File doesn't exists");
       }       
    }
    
}
