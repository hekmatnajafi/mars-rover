package com.example;

import java.util.Scanner;
import java.util.Vector;

public class App 
{
    public static void main( String[] args )
    {
        Vector<String> result = new Vector<String>();   
        Scanner inp = new Scanner(System.in);
        int w;
        int h;
        System.out.print("Plateau: ");
        String platua = inp.nextLine();
        String[] data = platua.split(" ");
        w = Integer.parseInt(data[0]);
        h = Integer.parseInt(data[1]);
        String coordinates;
        String instructions;
        int number = 1;
        while(true)
        {
            System.out.print("Rover"+number+" Landing: ");
            coordinates = inp.nextLine();

            // stop the loop if the input is empty
            if(coordinates == "")
            {
                break;
            }
            System.out.print("Rover"+number+" Instructions: ");
            instructions = inp.nextLine();
            Rover rover = new Rover(coordinates);
            rover.GoTo(instructions, w, h);
            result.add(rover.getResult());

            number++;
        }

        // printing the result
        for(int i = 0; i< result.size(); i++)
            {
                System.out.println(result.get(i));
            }
    }
}
