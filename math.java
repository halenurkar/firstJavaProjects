package packet1;
import java.util.Scanner;
import  java.lang.IndexOutOfBoundsException;
public class math {
static int factorial(int number) {

	if(number>0) {
	   return number*factorial(number-1);
	 }
	else
	{
		return 1;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      System.out.println("0.exit");
      System.out.println("1.factorial");
      System.out.println("2.reverse of number");
		int number;
		
		try
		{
			Scanner input= new Scanner(System.in);
			number=input.nextInt();
			switch(number)
			{
			case 0: break;
			case 1: {
				System.out.println("enter a number:");
				int factorialNumber;
				factorialNumber=input.nextInt(); 
				System.out.println(factorial(factorialNumber));
			}break;
			case 2:{
				int inNumber,digit=0,i,number1,j ;
				
				System.out.println("enter a number");
				inNumber=input.nextInt();
				number1=inNumber;
				while(number1!=0) {
					number1=number1/10;
					digit++;
				}
				int[] array = new int[digit];
				for(i=0; i<digit; i++ )
				{
					array[i]=inNumber%10;
					inNumber/=10;
					
				}
				System.out.println("digit is:"+digit);
				for(j=0; j<digit; j++) {
				System.out.print(array[j]);
				}
			}break;
			}
			
		}
		catch(IndexOutOfBoundsException unused)
		{
			System.out.println("enter the 0-4 between number"+unused);
			//System.out.println("please enter the between 0-3!");
		}
		
		
	}


}
