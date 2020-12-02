package logic_learn;
import java.util.Scanner;
public class practice_day_2 {
	public static void main (String args[])
	{
		int num2;
		int num3;
		int ara[];
		ara = new int[100];
		Scanner input= new Scanner (System.in);
		System.out.print ("Enter a number : ");
		int num1 = input.nextInt();
		int count=1;
		for (int i=0;;i++)
		{
			num2=num1%10;
			num3=num1/10;
			num1=num3;
			ara[i]=num2;
			System.out.println(ara[i]*Math.pow(10, i));
			if (num3<10)
			{
				num2=num3;
				ara[i]=num2;
				//System.out.println (num2);
				System.out.println(ara[i]*Math.pow(10, (i+1)));
				break;
			}
			count++;
		}		
	}

}
