package com.example;

import java.util.Scanner;
import java.util.Vector;
import java.nio.file.*;

public class App 
{
    // Reading input file from input.txt file
    public static String readFile()throws Exception
    {
      Scanner inp = new Scanner(System.in);
      String path = inp.nextLine();
      return new String(Files.readAllBytes(Paths.get(path)));
    }
    public static void main( String[] args )throws Exception
    {
        // Getting file data in main
        String input = App.readFile();


        Vector<String> result = new Vector<String>();   
        int w;
        int h;
        
        // Storing/splitting data into array based on new line
        String[] file = input.split("\\R");

        // extracting the Height and width of Platua
        String platua = file[0].split(":")[1];
        String[] data = platua.split(" ");
        w = Integer.parseInt(data[0]);
        h = Integer.parseInt(data[1]);
        String coordinates;
        String instructions;

        // Calculation and movement for every Rover
        for(int i =1; i<file.length; i+=2)
        {
            // storing the coordinates and instructions of River i
            coordinates = file[i].split(":")[1];
            instructions = file[i+1].split(":")[1];

            // passing the coordinate and instructions to Rover to move
            Rover rover = new Rover(coordinates);
            rover.goTo(instructions, w, h);
            result.add(rover.getResult());
        }

        // Printing the result
        for(int i = 0; i< result.size(); i++)
            {
                System.out.println("Rover"+(i+1)+":"+result.get(i));
            }
    }
}
