// File name: MyOval.java
// Written by: Bladimir Nunez
// Description: Oval file will create an oval and will use specified methods below
//              to return values about an oval shape
//              
// Challenges: None
// Time Spent: 25 min
// Revision History:
// Date: 10/3/2021 By: B.N Action: 
// ---------------------------------------------------


//import color package
import javafx.scene.paint.Color;

public class MyOval extends MyBoundedShape {
    private double xRadius,yRadius;
    
    MyOval()
    {
        super();                  //Three constructors invoked from superclass using super 
                                 // method to take in points,color and boolean
    }
    MyOval(int x1, int y1, int x2, int y2)
    {
        super(x1,y1,x2,y2);
    }
    MyOval(int x1, int y1, int x2, int y2,Color color, boolean filled)
    {
        super(x1, y1,x2,y2, color,filled);
    }
    public double getxRadius()
    {
       xRadius = ((double) 1 / 2) * getWidth();
       
       return xRadius;
        
    }
    //getxRadius/getyRadius methods return radius of oval shape
    public double getyRadius()
    {
        yRadius = ((double) 1 / 2) * getHeight();
        
        return yRadius;
    }
    @Override
    public double getArea()
    {
        double area = getxRadius()*getyRadius()*Math.PI;
        
        return area;
    }
    //Area and perimeter methods return area and perimeter for oval shape
    @Override
    public double getPerimeter()
    {
        double perimeter = 2*Math.PI*Math.sqrt(((getxRadius()*getxRadius())+ (getyRadius()*getyRadius()))/2.0);
        
        return perimeter;
    }
    //display name of shape
    @Override
    public String getName()
    {
        return "Oval";
    }
    //toString method to return x and y radius for oval
    public String toString()
    {
        return super.toString()+"XRadius: " + getxRadius() + " " + "YRadius: "+getyRadius()+"\n"
                + "Area: " +getArea()+" Perimeter: "+getPerimeter();
    }
     //take in object to compare from getArea method
    public int compareTo(MyOval o)
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
