package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void turnLeft()
    {
        Rover rover = new Rover("1 2 N");
        rover.turnLeft();
        System.out.println(rover.direction);
        assertEquals("W", rover.direction);
    }

    // When turning right
    @Test
    public void turnRight()
    {
        Rover rover = new Rover("1 2 N");
        rover.turnRight();
        System.out.println(rover.direction);
        assertEquals("E", rover.direction);
    }

    // moving forward
    @Test
    public void move()
    {
        Rover rover = new Rover("1 2 N");
        rover.move(5,5);
        System.out.println(rover.direction);
        assertEquals(3, rover.y);
    }

    // Go to (landing)
     @Test
     public void goTo()
     {
         Rover rover = new Rover("1 2 N");
         rover.goTo("LMLMLMLMM", 5, 5);
         assertEquals("1 3 N", rover.getResult());
     }
}
