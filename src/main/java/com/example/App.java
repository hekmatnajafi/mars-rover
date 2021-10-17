package com.example;

import java.util.Scanner;
import java.util.Vector;
import java.nio.file.*;

public class App 
{
    public static void main( String[] args )throws Exception
    {
        Vector<String> result = new Vector<String>();   
        int w;
        int h;
        // extracting the Height and width of Platua
        Scanner inp = new Scanner(System.in);
        System.out.print("Plateau:");
        String platua = inp.nextLine();
        String[] data = platua.split(" ");
        w = Integer.parseInt(data[0]);
        h = Integer.parseInt(data[1]);
        String coordinates;
        String instructions;
        int number =1;
        System.out.print("Rover"+number+" Landing:");
        coordinates = inp.nextLine();

        while(!coordinates.isEmpty())
        {
            //  storing the coordinates and instructions of River i
            System.out.print("Rover"+number+" Instructions:");
            instructions = inp.nextLine();
            // passing the coordinate and instructions to Rover to move
            Rover rover = new Rover(coordinates);
            rover.goTo(instructions, w, h);
            result.add(rover.getResult());
            number++;

            System.out.print("Rover"+number+" Landing:");
            coordinates = inp.nextLine();

        }
        // Printing the result
        for(int i = 0; i< result.size(); i++)
            {
                System.out.println("Rover"+(i+1)+":"+result.get(i));
            }
    }
}
