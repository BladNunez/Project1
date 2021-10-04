// Written by: Bladimir Nunez
// Description: Implement all methods and create objects for the shape classes
//              and display the comparisons between objects and output
//              Area/perimeter, points, name, y and x radius for oval and all other shapes 
//              
// Challenges: One challenge I had was implementing the max method to compare two objects
//             had a challenge because I did not know that to call a static method you need
//             to use the class that it is in.
//             
// Time Spent: 45 mib
// Revision History:
// Date: 10/3/2021 By: B.N Action: 
// ---------------------------------------------------

//Imports to use color/arrayList packages
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class MyShapesTest {
    
    public static void main(String[] args)throws CloneNotSupportedException
    {
       // Create two comparable ovals
        MyOval oval1 = new MyOval(10, 10, 20, 30, Color.AQUA, true);
        MyOval oval2 = new MyOval(20, 10, 130, 140, Color.BLUE, false);
        
      //create the clone for oval 1
        MyOval oval3 = (MyOval)oval1.clone();
     
     // Create two comparable circles
        MyCircle circle1 = new MyCircle(110, 110, 130, 130, Color.BEIGE, false);
        MyCircle circle2 = new MyCircle(220, 10, 245, 35);
        
    // Create two comparable rectangles
        MyRectangle r1 = new MyRectangle(25,34, 100, 200, Color.YELLOW, true);
        MyRectangle r2 = new MyRectangle(35,134, 100, 150);
        
   // Create two comparable squares 
        MySquare s1 = new MySquare(112,120, 138, 146);
        MySquare s2 = new MySquare(12,20, 50, 46, Color.BROWN,true);
        
   //create the clone for square s2 object
       MySquare s3 = (MySquare)(s2.clone());
       
   // Create two comparable lines
      MyLine line1= new MyLine(10, 20, 45, 67, Color.BLUEVIOLET);
      MyLine line2= new MyLine(70, 120, 165, 278, Color.BLUE);
      
      //Create arrayList of a class to add objects to
      ArrayList<MyShape> list = new ArrayList<>();
      
      list.add(oval1);
      list.add(oval2);
      list.add(oval3);
      list.add(circle1); //Adding of objects to arrayList
      list.add(circle2);
      list.add(r1);
      list.add(r2);
      list.add(s1);
      list.add(s2);
      list.add(s3);
      list.add(line1);
      list.add(line2);
      
      //Loop through arrayList to display each shape classes properties
      //such as name,points,area,perimeter,radius's
      for(MyShape lists : list)
      {
         System.out.println("Name of shape: "+lists.getName());
         System.out.println("Points: "+lists.getCoordinatesAsString());
         
         System.out.println(lists.toString());
         System.out.println("--------------------------------");
      }
      
      //This large section of print statements will use the compareTo method,equals method
      //and the max method to compare objects we have created for each shape above and 
      // to determine if they are equal to eachother as well find the max values between two
      // objects. In final this will return true/false for equal method, max values for max method and
      //signals if both objects are the same or diffrent in size.
      System.out.println("The result of comparison:");
      System.out.println("Comparison of oval 1 and oval 2: "+oval1.compareTo(oval2)+"\n"
                         +"Comparison of oval 1 and oval 3: "+oval1.compareTo(oval3));
      
      System.out.println("Comparison of circle 1 and cirlce 2: "+circle1.compareTo(circle2)+"\n"
                         +"Comparison of Rectangle 1 and rectangle 2: "+r1.compareTo(r2));
     
      
      System.out.println("Comparison of Square 1 and square 2: "+s1.compareTo(s2)+"\n"
                         +"Comparison of Square 2 and square 3: "+s2.compareTo(s3));
      System.out.println("------------------------------------");
      System.out.println("Result of oval 1 and oval 2 using equals method: "+oval1.equals(oval2)+"\n"
                         +"Result of circle 1 and circle 2 using equals method: "+circle1.equals(circle2));
      
      System.out.println("Result of rectangle 1 and rectangle 2 using equals method: "+r1.equals(r2)+"\n"
                         +"Result of square 3 and square 1 using equals method: "+s3.equals(s1));
      System.out.println("---------------------------------------------------------------");
      
      MyOval oval = (MyOval) MyBoundedShape.max(oval1,oval2);
      System.out.println("Max oval x radius: "+oval.getxRadius()+" Max oval y radius: "+oval.getyRadius());
      System.out.println("Max oval coordinates: "+oval.getCoordinatesAsString());
      
      MyCircle circle = (MyCircle) MyBoundedShape.max(circle1,circle2);
      System.out.println("Max circle radius: "+circle.getRadius());
      System.out.println("Max circle coordinates: "+circle.getCoordinatesAsString());
      
      MyRectangle rect = (MyRectangle) MyBoundedShape.max(r1,r2);
      System.out.println("Max rectangle Width: "+rect.getWidth()+" Max rectangle height: "+rect.getHeight());
      System.out.println("Max rectangle coordinates: "+rect.getCoordinatesAsString());
      
      MySquare sq = (MySquare) MyBoundedShape.max(s1,s2);
      System.out.println("Max square side: "+sq.getSide());
      System.out.println("Max square coordinates: "+sq.getCoordinatesAsString());
      
     
      
      
      
      
      

    }
}
