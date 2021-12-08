import java.util.Scanner;

public class Calculator 
{
	public static void main(String args[])
	{
		String yn="";
			do 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the first number: ");
				int no1=sc.nextInt();
				System.out.println("Enter the second number: ");
				int no2=sc.nextInt();
				System.out.println("What do you want(+,-,*,/)");
				String sym=sc.next();
				switch(sym)
				{
					case "+":
						System.out.println("Sum is :"+(no1+no2));
						break;
					case "-":
						System.out.println("Sub  is :"+(no1-no2));
						break;
					case "*":
						System.out.println("Mul is :"+(no1*no2));
						break;
					case "/":
						System.out.println("Div is :"+(no1/no2));
						break;
					default:
						System.out.println("Invalid Symbol");
						break;
				}
				System.out.println("Do You Want To Continue?");
				yn=sc.next();
				
				
				}
				while(yn.equals("y")|| yn.equals("Y"));
				System.out.println("THANK YOU");
	}

}
