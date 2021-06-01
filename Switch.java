package mycaptain_java;
import java.util.Scanner;
public class Switch
{
public static void main(String args[])
{
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the color number in rainbow  from 1 to 7 : ");
	i=sc.nextInt();
	switch(i)
	{
	case 1:
		System.out.print("Violet");
		break;
	case 2:
		System.out.print("Indigo");
		break;
	case 3:
		System.out.print("Blue");
		break;
	case 4:
		System.out.print("Green");
		break;
	case 5:
		System.out.print("Yellow");
		break;
	case 6:
		System.out.print("Orange");
			break;
	case 7:
		System.out.print("Red");
			break;
			default : 
				System.out.print("Enter the correct option");
	}
	
}
}
