package javaminiprojects;
import java.util.*;
public class Calculator1 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
	    System.out.print("Enter num1: ");
	    int num1=Sc.nextInt();
	    System.out.print("\nEnter num2: ");
	    int num2=Sc.nextInt();
	    System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
	    System.out.print("\nSelect one operation from above: ");
	    int choice=Sc.nextInt();
	    switch(choice)
	    {
	    case 1: System.out.println(num1+num2);
	            break;         
	    case 2: System.out.println(num1-num2);
                break;
	    case 3: System.out.println(num1*num2);
                break;
	    case 4: System.out.println(num1/num2);
                break;
        default: System.out.println("Invalid Choice");
	    }
	}

}
