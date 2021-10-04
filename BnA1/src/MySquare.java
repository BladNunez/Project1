// File name: MySquare.java
// Written by: Bladimir Nunez
// Description: This file will create a square and implement area/perimeter 
//              methods to return in main method as well as color of square
//              
// Challenges: None
// Time Spent: 35 min
// Revision History:
// Date: 10/3/2021 By: B.N Action: 
// ---------------------------------------------------

//Import color package
import javafx.scene.paint.Color;

public class MySquare extends MyBoundedShape {
    private int side;
    
    MySquare()
    {
        super();
    }
     MySquare(int x1, int y1, int x2, int y2)
    {
        super(x1, y1,x2,y2);                 //Three constructors invoked from superclass 
                                             // using super method
    }
    MySquare(int x1, int y1, int x2, int y2,Color color, boolean filled)
    {
        super(x1, y1,x2,y2, color,filled);
    }
    //getSide method will return sides of square 
    public int getSide()
    {
        if(super.getWidth() > super.getHeight())
            return  side+=super.getWidth();
        else
           return side+=super.getHeight();
    }
    //return name of shape
    @Override
    public String getName()
    {
        return "Square";
    }
    //return area of square using getSide method
    @Override
    public double getArea()
    {
        double area = getSide() * getSide();
        
        return area;
    }
    //return perimeter of square using getSide method
    @Override
    public double getPerimeter()
    {
        double perimeter = getSide() * 4;
        
        return perimeter;
    }
    //toString to return side, area and perimter of square
    public String toString()
    {
        return super.toString()+"Side: " + getSide()+"\n"+"Area: "+getArea()+"\n"
                +"Perimeter: "+getPerimeter();
    }
   //compareTo method takes in a object to compare from the getArea() method
    public int compareTo(MySquare o)
    {
        if(this.getArea()> o.getArea())
        {
            return 1;
        }else if(this.getArea() == o.getArea())
        {
            return 0;      
        }
        else{
            return -1;
        }
    
    }
}
