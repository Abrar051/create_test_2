package logic_learn;
import java.util.Scanner;
public class logic_3 {
	public static void main (String args[])
	{
		System.out.print("Enter a number : ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int number2;
		int power_num;
		int count=1,count2=1;
		number2=(int) (number/Math.pow(10,8));
		if (number2>=1)
		{
			System.out.println ("More than crore ");
			for (int i=0;;i++)
			{
				number2=number2/10;
				if (number2<1)
				{
					System.out.print(count);
					break;
				}
				count++;
			}
		}
		else if (number2<1)
		{
			System.out.println("less than crore");
		}
	}

}

