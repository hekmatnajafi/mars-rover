package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void TurnLeft()
    {
        Rover rover = new Rover("1 2 N");
        rover.TurnLeft();
        System.out.println(rover.direction);
        assertEquals("W", rover.direction);
    }

    // When turning right
    @Test
    public void TurnRight()
    {
        Rover rover = new Rover("1 2 N");
        rover.TurnRight();
        System.out.println(rover.direction);
        assertEquals("E", rover.direction);
    }

    // moving forward
    @Test
    public void Move()
    {
        Rover rover = new Rover("1 2 N");
        rover.Move();
        System.out.println(rover.direction);
        assertEquals(3, rover.y);
    }

    // Go to (landing)
     @Test
     public void GoTo()
     {
         Rover rover = new Rover("1 2 N");
         rover.GoTo("LMLMLMLMM");
         assertEquals("1 3 N", rover.getResult());
     }
}
