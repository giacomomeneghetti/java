package anass;
import java.util.*;
public class ES_3_DOC_GOOGLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrice = new int[10][10];
		int cont = 0;
		int a = 2;
		//riempo la matrice a mano e verifico se il numero zaero è dentro la matrice
		for (int i=0; i<matrice.length; i++)
		{
			for (int j=0; j<matrice.length; j++)
			{
				matrice[i][j]= (int) (Math.random()*10);
				if(a == matrice[i][j])
				{
					cont += 1;
				}
			}
		}
		
		//stampo la matrice
		for (int i=0; i<matrice.length; i++)
		{
			for (int j=0; j<matrice.length; j++)
			{
				System.out.print(matrice[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Il numero " + a + " si trova " + cont + " volte all'interno della matrice");

	}

}
