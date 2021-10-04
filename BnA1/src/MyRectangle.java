// File name: MyRectngle.java
// Written by: Bladimir Nunez
// Description: Rectangle class will display methods down below to return area/perimeter
//              
//              
// Challenges: None
// Time Spent: 25 min
// Revision History:
// Date: 10/3/2021 By: B.N Action: 
// ---------------------------------------------------

import javafx.scene.paint.Color;

public class MyRectangle extends MyBoundedShape {
    
    MyRectangle()
   {
        super();
    }
    MyRectangle(int x1, int y1, int x2, int y2)
    {
        super(x1, y1,x2,y2);
    }
    MyRectangle(int x1, int y1, int x2, int y2,Color color, boolean filled)
    {
        super(x1, y1,x2,y2, color,filled);
    }
    @Override
    public double getArea()
    {
       return getWidth() * getHeight();
       
    }
    @Override
    public double getPerimeter()
    {
        double perimeter = getWidth() * 2 + getHeight() *2;
        
        return perimeter;
    }
    @Override
    public String getName()
    {
        return "Rectangle";
    }
    
    public String toString()
    {
        return super.toString()+ "Width: " + getWidth() +" , " + "Height: " +getHeight()+"\n"
                +"Area: "+getArea()+" Perimeter: "+getPerimeter();
    }
    
   
    public int compareTo(MyRectangle o)
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
