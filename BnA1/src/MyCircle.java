// File name: MyCirlce.java
// Written by: Bladimir Nunez
// Description: Create cirlce shape to return methods/values specified below to
//              display output about circle shape
// Challenges: None
// Time Spent: 26 min
//Revision History:
// Date: 10/3/2021 By: B.N Action: 
// --------------------------------------------------

//import color package
import javafx.scene.paint.Color;

public class MyCircle extends MyBoundedShape{
    private double radius;
    
    MyCircle()
    {
        super();
    }
    MyCircle(int x1, int y1, int x2, int y2)  //Three constructors invoked from super class
                                             // to display points,color,boolean
    {
        super(x1, y1,x2,y2);
    }
    MyCircle(int x1, int y1, int x2, int y2,Color color, boolean filled)
    {
        super(x1, y1,x2,y2, color,filled);
    }
    //return radius for circle
    public double getRadius()
    {
          if (super.getWidth() > super.getHeight()) {
            return radius+=((double) 1 / 2) * super.getWidth();
        } else {
            return radius+=((double) 1 / 2) * super.getHeight();
        }
    }
    //return area of circle
    @Override
    public double getArea()
    {
        double area= getRadius()*getRadius()*Math.PI;
        
        return area;
    }
    //return perimeter of circle
    @Override
    public double getPerimeter()
    {
        double perimeter = 2*getRadius()*Math.PI;
        
        return perimeter;
    }
    //return name of shape
    @Override
    public String getName()
    {
        return "Circle";
    }
    
    public String toString()
    {
        return super.toString()+ "Radius: "+getRadius()+"Area: "+getArea()+"\n"+
                "Perimeter: "+getPerimeter();
    }
    
    public int compareTo(MyCircle o)
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
