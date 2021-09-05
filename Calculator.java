import java.util.Scanner;

public class Calculator {
    
    
public static void main(String args[])
    {
         Scanner input = new Scanner(System.in);
        
        int num1,num2;
        int add,data;
        
        boolean done = false;
        do{
        
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        
        System.out.println("Enter second number: ");
        num2 = input.nextInt();
        
        if(num1 <= -1 || num2 <= -1)
        {
            System.out.println("Error! only enter positive numbers!");
            
            System.out.println("Enter first number: ");
            num1 = input.nextInt();
        
            System.out.println("Enter second number: ");
            num2 = input.nextInt();
        }
            
        System.out.println("Enter 1 if you would like to Add:");
        System.out.println("Enter 2 if you would like to Subtract:");
        System.out.println("Enter 3 if you would like to Multiply:");
        System.out.println("Enter 4 if you would like to Divide:");
        System.out.println("Enter 00 to quit");
          
        data = input.nextInt();
        
        switch(data)
        {
            case 1:
                add = num1 + num2;
                System.out.println("Result: " + add);
                break;
            case 2:
                add = num1 - num2;
                System.out.println("Result: " + add);
                break;
            case 3:
                add = num1 * num2;
                System.out.println("Result: " + add);
                break;
            case 4:
                try{
                    add = num1/num2;
                    System.out.println("Result: " + add);
                    break;
                }
                catch(ArithmeticException e)
                {
                    System.out.println("Cant divide by zero!!" + e); 
                }
                break;
            case 00:
                done = true;
        }
        
        }
        while(!done);
        
       
        
    
    }
}
    


