package anass;
import java.util.Scanner;
public class ES_6_DOC_GOOGLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int mat[][] = new int[5][5];
		boolean a = true;
		for (int i=0; i<mat.length; i++)
		{
			for (int j=0; j<mat.length; j++)
			{
				mat[i][j] = (int) (Math.random()*10);
				//output
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		int n = input.nextInt();
		int m = input.nextInt();
		int scambio = 0;
		if (n>m)
		{
			scambio = n;
			n = m;
			m = scambio;
		}
		
		for (int i=0; i<mat.length; i++)
		{
			for (int j=0; j<mat.length; j++)
			{
				if(!(mat[i][j]>n&& mat[i][j]<m))
				{
					a = false;
				}
			}
		}
		if (a==true)
		{
			System.out.println("Tutte le celle della matrice hanno valori compresi tra " + n + " e " + m);
		}
		else
		{
			System.out.println("Non tutte le celle della matrice hanno valori compresi tra " + n + " e " + m);
			
		}
			
		
	}

}
