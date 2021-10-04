// File name: MyShape.java
// Written by: Bladimir Nunez
// Description: MyShape class will initialize point objects and create date and color
//              objects to pass into later constructors in other classes to display
//              coordinates and color of shape 
//
// Challenges: None
// Time Spent: 25 min
// Revision History:
// Date: 10/3/2021 By: B.N Action: 
// ---------------------------------------------------

//import color and date package
import javafx.scene.paint.Color;
import java.util.Date;
 
public abstract class MyShape implements MyGeometricObject {
    
    private MyPoint point1,point2;
    private Color color;                //Instance variables declared for data,color,points
    private Date dateCreated;
   
    MyShape()
    {
        point1 = new MyPoint(0,0);
        point2 = new MyPoint(0,0);
        dateCreated = new Date();         
        color = Color.BLACK;
        
    }
    MyShape(int x1, int y1, int x2, int y2)
    {
        point1 = new MyPoint(x1,y1);
        point2 = new MyPoint(x2,y2);
        dateCreated = new Date();
        color = Color.BLACK;
        
              
    }
    MyShape(int x1, int y1, int x2, int y2, Color color)
    {
        point1 = new MyPoint(x1,y1);
        point2 = new MyPoint(x2,y2);
        dateCreated = new Date();
        this.color = color;
        
    }
    public void setcolor(Color color)
    {
        this.color = color;
    }
    public Color getcolor()
    {
        return color;                //Create set/get methods to initialize instance
    }                                // variables
    public MyPoint getpoint1()
    {
        return point1;
    }
    public MyPoint getpoint2()
    {
        return point2;
    }
    //return points as string format
    public String getCoordinatesAsString()
    {
      
       return  "[("+point1.getx()+", "+point1.gety()+"),("+point2.getx()+"," +point2.gety()+")]";
    }
    //return date and color 
    public String toString()
    {
        return "Created on " + dateCreated + "\n" + "Color: " + color;
    }
}
