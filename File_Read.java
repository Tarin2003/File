/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class File_Read {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\Hp\\Documents\\NetBeansProjects\\File\\person\\student.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String id = scanner.next();
                String name = scanner.next();
                System.out.println("ID : "+id +"   "+"Name : "+name);
            }
            scanner.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
