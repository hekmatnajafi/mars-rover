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
    public void turnRight(){
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
    public void turnLeft(){
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
    public void move(int w, int h){
        
        switch(direction){
            case "N":
                if(y < h)
                    y++;
                break;
            case "E":
                if(x<w)
                    x++;
                break;
            case "S":
                if(y>0)
                    y--;
                break;
            case "W":
                if(x>0)
                    x--;
                break;
            default:
            break;
        }
    }

    public void goTo(String instructions, int w, int h)
    {
        char[] ins = instructions.toCharArray();
        for(int i =0; i< ins.length; i++)
        {
            switch(ins[i])
            {
                case 'M':
                    move(w, h);
                    break;
                case 'R':
                    turnRight();
                    break;
                case 'L':
                    turnLeft();
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
