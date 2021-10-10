package com.example;
public class Rover {

    public int x;
    public int y;
    public String direction;

    public Rover(String location)
    {
        String[] data = location.split(" ");
        x = Integer.parseInt(data[0]);
        y = Integer.parseInt(data[1]);
        direction = data[2];
        
    }
    public void TurnRight(){
        switch(direction){
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
            default:
            break;
        }
    }
    public void TurnLeft(){
        switch(direction){
            case "N":
                direction = "W";
                break;
            case "E":
                direction = "N";
                break;
            case "W":
                direction = "S";
                break;
            case "S":
                direction = "E";
                break;
            default:
            break;
        }
    }
    public void Move(){
        switch(direction){
            case "N":
                y++;
                break;
            case "E":
                x++;
                break;
            case "S":
                y--;
                break;
            case "W":
                x--;
                break;
            default:
            break;
        }
    }

    public void GoTo(String instructions)
    {
        char[] ins = instructions.toCharArray();
        for(int i =0; i< ins.length; i++)
        {
            switch(ins[i])
            {
                case 'M':
                    Move();
                    break;
                case 'R':
                    TurnRight();
                    break;
                case 'L':
                    TurnLeft();
                    break;
                default:
                    break;
            }

        }
    }
    public String getResult(){
        return x + " " + y + " " + direction;
    }
}
