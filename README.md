## Mars Rover

A squad of robotic rovers are to be landed by NASA on a plateau on Mars.

This plateau, which is curiously rectangular, must be navigated by the rovers so that their on board cameras can get a complete view of the surrounding terrain to send back to Earth.

A rover's position is represented by a combination of an x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.

In order to control a rover, NASA sends a simple string of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot.

'M' means move forward one grid point, and maintain the same heading.

Assume that the square directly North from (x, y) is (x, y+1).

Input:

Configuration Input: The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.

Per Rover Input:

Input 1: Landing co-ordinates for the named Rover. The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation.

Input 2: Navigation instructions for the named rover. i.e a string containing ('L', 'R', 'M').

Test Input:
```
Plateau:5 5
Rover1 Landing:1 2 N
Rover1 Instructions:LMLMLMLMM
Rover2 Landing:3 3 E
Rover2 Instructions:MMRMMRMRRM
```

Expected Output:
```
Rover1:1 3 N
Rover2:5 1 E
```

## How it Works:

This solution is implemented by Java Programming language and created by Maven tool

I used Visual Studio Code as IDE and JRE >= 11

### How to run:

I used visual Visual Studio Code as my IDE
1. Install the extension called ```Extension Pack for Java``` in VSCode
2. Clone the project by running the command ```git clone git@github.com:hekmatnajafi/mars-rover.git```
4. Go to the directory called ```mars-rover``` which is created after you cloned the project
5. In that directory, open command line and enter: ```javac -cp . src/main/java/com/example/App.java```
6. after the above command, enter ```java src/main/java/com/example/App.java```
7. now the program is running, please enter the input file path. for example mine is ```src/main/java/com/example/input.txt```
8. after entering the path, it will read the test cases and will display the results in command line


## Testing
You can test the project output by running the test file which is inside ```/stc/test/java/com/example``` directory.
After opening the file, there are 4 methods/functions to test every action of of the project, please pass the needed test cases to the method and get the the result.

### There are two ways to run the tests:
1. Use Maven(command Line), make sure you have installed Maven package. open the root folder of project (/mars-rover/) and run ```mvn clean test``` it will show the test(s) results. if its not worked, please run ```mvn clean package``` insdie root folder of project the run again the ```mvn clean test``` command.
2. The IDE will create the ```Run Test | Debug Test``` buttons on the top of every test functions which you can just click and run it

Note: if you used the IDE to run the test, generally the test result will be showed in new tap in right side of IDE, but if it does not displayed, please go to the IDE settings (click on setting icon if bottom left side of IDE) and search for ```exlude``` word, a list will be showed, please remove the ```./classpath``` and ```./project``` from that list and run the test again.
