import java.util.Scanner;

public class array2D_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入A為mxp的矩陣");
		int m = scn.nextInt();
		int p = scn.nextInt();
		System.out.println("請輸入B為pxn的矩陣");
		int n = scn.nextInt();
		
		int a[][] = new int[m][p];
		int b[][] = new int[p][n];
		int c[][] = new int[m][n];
		for (int i = 0; i <= m; i++) {
			for (int l = 0; l <= n; l++) {
				for(int g = 0;g<p;g++){
					c[m][n] = c[m][n]+a[m][g]*b[g][n];
				}
				System.out.print(c[m][n]+"\t");
				
				// a[i][j]*b[k][l];
			}
			System.out.println();
		}

	}

}
