package deneme1;
import java.util.Scanner;
import java.io.IOException;
public class negativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double number;
		System.out.println("entr a namber:");
		Scanner input=new Scanner(System.in);
		number = input.nextDouble();
		
		if(number<0)
		{
			System.out.println("please enter a positive number!");
		}
		else
		{
			number=Math.sqrt(number);
			System.out.println("sqrt is:"+number);
		}
           
	}

}
