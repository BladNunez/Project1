// File name: MyLine.java
// Written by: Bladimir Nunez
// Description: Returns name of object and will display points and color of object line
//              
// Challenges: None
// Time Spent: 5 min
// Revision History:
// Date: 10/3/2021 By: B.N Action: 
// ---------------------------------------------------

//import color package
import javafx.scene.paint.Color;

public class MyLine extends MyShape{
    
    MyLine()
    {                       //Three constructors invoked from superclass using super method
                           // to take in points,color and a boolean 
        super();
    }
    MyLine(int x1, int y1, int x2, int y2)
    {
       super(x1,y1,x2,y2);
       
    }
    MyLine(int x1, int y1, int x2, int y2, Color color)
    {
        super(x1,y1,x2,y2,color);
    }
    //method returning name of object
    @Override
    public String getName()
    {
        return "Line";
    }
    
}
