/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class File_Write {
    public static void main(String[] args) {
        try{
            Formatter formatter;
            formatter = new Formatter("C:\\Users\\Hp\\Documents\\NetBeansProjects\\File\\person\\student.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("How many students : ");
            int num = input.nextInt();
            for(int i =0; i<num; i++)
            {
                System.out.println("Enter Student ID and Name : ");
                String id = input.next();
                String name = input.next();
                formatter.format("%s %s\r\n", id,name);
            }
            formatter.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
    
}
