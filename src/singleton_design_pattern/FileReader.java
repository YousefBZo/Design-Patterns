/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton_design_pattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Yousef
 */
public class FileReader {

    private FileReader() {
    }
    ;
    private static FileReader Instance = null;

    public static FileReader getReader() {
        if (Instance == null) {
            Instance = new FileReader();
        }
        return Instance;
    }

    public void printFile(String path) throws FileNotFoundException {
        File text = new File(path);
        Scanner s = new Scanner(text);

        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
    }
}
