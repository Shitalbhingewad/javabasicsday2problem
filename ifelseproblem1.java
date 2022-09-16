import java.util.Scanner;
public class ifelseproblem1 {
public static void main(String args[])
{
	try (Scanner sc = new Scanner(System.in)) {
		int number = 0;
		number = sc.nextInt();
		if(number==0)
		{
			System.out.println("Zero");
		}
		if(number==1)
		{
			System.out.println("one");
		}
		if(number==2)
		{
			System.out.println("Two");
		}
		if(number==3)
		{
			System.out.println("Three");
		}
		if(number==4)
		{
			System.out.println("Four");
		}
		if(number==5)
		{
			System.out.println("Five");
		}
		if(number==6)
		{
			System.out.println("Six");
		}
		if(number==7)
		{
			System.out.println("Seven");
		}
		if(number==8)
		{
			System.out.println("Eight");
		}
		if(number==9)
		{
			System.out.println("Nine");
			}
		else
		{
			System.out.println("enter Single Digit Number");
		}
	}
}
}
