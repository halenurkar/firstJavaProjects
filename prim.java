package deneme1;
import java.util.Scanner;
import java.io.IOException;
public class prim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*Günlük satýþ miktarý 50 adetten az ise 15 TL tutarýndaki sabit ücrete, satýlan ürün baþýna 1 TL deðerinde prim eklenerek günlük ücret belirlenir.
Günlük satýþ miktarý 50 adet ya da daha fazla ise, bu durumda günlük sabit ücret 15 TL alýnarak, satýlan ürün baþýna da ilk 50 adet ürün için 2 TL, 50 adedi aþan kýsým için de 3 TL prim verilerek günlük ücret belirlenir.*/
		
		
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
