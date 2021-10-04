// File name: MyBoundedShape.java
// Written by: Bladimir Nunez
// Description: This file will implement methods such as getWidth,height,getUpperLeftx and y
//               and isfilled method, compareTo,max. This file will be inherited by our shape classes
//               to find the area and perimeter of each as well as specific points
//               in each shape class and because each object will take in a isfilled() method
//               we will know if the shapes are filled or not.
//
// Challenges: Implementing the compareTo() method as well as the max() method.
//             Had to figure out how to compare one method from another specific 
//             method such as getArea(). With the max method it was difficult at first to 
//             implement the compareTo() method in the max method to compare two objects.
//
// Time Spent: 1 hour
// Revision History:
// Date: 10/3/2021 By: B.N Action: 
// ---------------------------------------------------

import javafx.scene.paint.Color;

public abstract class MyBoundedShape extends MyShape implements Comparable<MyBoundedShape>,Cloneable 
{
    //private instance variable filled
    private boolean filled = false;
       
    MyBoundedShape()
    {
        super();       //set three constructors to take in super class
                       //constructors and will use super method to do so. 
        
    }
     
    MyBoundedShape(int x1, int y1,int x2,int y2)  
    {
        super(x1,y1,x2,y2);
    }
    MyBoundedShape(int x1, int y1,int x2,int y2, Color color,boolean filled)
    {
        super(x1,y1,x2,y2,color);
        this.filled = filled;
    }
    //Implement getUpperLeftX method to find smallest value between 
    //the two x value points
    public int getUpperLeftX()
    {
       int xValue1 = getpoint1().getx();
       int xValue2 =  getpoint2().getx();
       
     if(xValue1 < xValue2)
     {
         return xValue1;
     }else{
         return xValue2;
     }
      
    }
    //Implement getUpperLeftY method to find smallest value between
    //the two smallest y value points
    public int getUpperLeftY()
    {
        int yValue1 = getpoint1().gety();
        int yValue2 = getpoint2().gety();
        
        if(yValue1 < yValue2)
        {
            return yValue1;
        }else{
            return yValue2;
        }
        
    }
    //getWidth method will find the width of a shape
    //by taking the two x values and get the absolute value between them
    public int getWidth()
    {   
        int xValue1 = getpoint1().getx();
        int xValue2 = getpoint2().getx();
        
        int width = Math.abs(xValue1 - xValue2);
        
        return width;
        
    }
    //getHeight method will take the two y values and find the 
    //absolute value between them and return height variable
    public int getHeight()
    {
        int yValue1 = getpoint1().gety();
        int yValue2 = getpoint2().gety();
        
        int height = Math.abs(yValue1 - yValue2);
        
        return height;
      
    }
    //this isfilled method will return if our shape is filled
    //this will either return true or false
    public boolean isfilled()
    {
        return filled;
    }
    //set method to initiate filled instance variable
    public void setfilled(boolean isfilled)
    {
        filled = isfilled;
    }
    //toString 
    public String toString()
    {
        return super.toString() + "\n" + "Filled:" + isfilled();
    }
    
    //Declare two abstract methods that will be implemented
    // in our shapes classes to find area/perimeter
    public abstract double getArea();
    public abstract double getPerimeter();
    
    //take in an object to compare from getArea method
    @Override
    public int compareTo(MyBoundedShape o)
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
    //max method to take in 2 objects and return the greater value between them
     public static MyBoundedShape max(MyBoundedShape o1, MyBoundedShape o2) 
     {
        if (o1.compareTo(o2) == 1) {
            return o1;
        } else {
            return o2;
        }
     }
        //create clone method that will clone objects when called
    @Override
    public Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }
    
}
