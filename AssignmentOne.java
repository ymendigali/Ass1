package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AssignmentOne {
    public static void read(){
        try {
            File points = new File("points.txt");
            Scanner reader = new Scanner(points);
            while (reader.hasNextLine()) {
                String point = reader.nextLine();
                System.out.println(point);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
