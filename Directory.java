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
public class Directory {
    public static void main(String[] args) {
        File dir = new File("person");
        dir.mkdir();
        String dirlocation = dir.getAbsolutePath();
        System.out.println("Folder location :"+dirlocation);
        System.out.println("Foder name : "+dir.getName());
    }
   
}
