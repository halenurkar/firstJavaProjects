package deneme1;
import java.util.Scanner;
import java.io.IOException;
public class prim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*G�nl�k sat�� miktar� 50 adetten az ise 15 TL tutar�ndaki sabit �crete, sat�lan �r�n ba��na 1 TL de�erinde prim eklenerek g�nl�k �cret belirlenir.
G�nl�k sat�� miktar� 50 adet ya da daha fazla ise, bu durumda g�nl�k sabit �cret 15 TL al�narak, sat�lan �r�n ba��na da ilk 50 adet �r�n i�in 2 TL, 50 adedi a�an k�s�m i�in de 3 TL prim verilerek g�nl�k �cret belirlenir.*/
		
		
		int prim,price;
		Scanner input= new Scanner(System.in);
		System.out.println("enter the sale amount:");
		prim=input.nextInt();
		
		if(prim<50)
		{
			price=15+prim;
		}
		else
		{
			price=(15+(50*2)+(3*(prim-50)));
		}
         System.out.println("total price:"+price);
	}

}
