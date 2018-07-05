package packet1;

import java.util.Scanner;

public class deneme2 {

	private static int arrays[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int number,digit=0,i,number1,j ;
		
		System.out.println("enter a number");
		number=input.nextInt();
		number1=number;
		while(number1!=0) {
			number1=number1/10;
			digit++;
		}
		int[] array = new int[digit];
		for(i=0; i<digit; i++ )
		{
			array[i]=number%10;
			number=number/10;
			
		}
		
		System.out.println("digit is:"+digit);
		for(j=0; j<digit; j++) {
		System.out.print(array[j]);
		}

	}

}
