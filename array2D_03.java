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
		int i = 0;
		int g = 0;
		int l = 0;
		System.out.println("請輸入A矩陣的數字");
		for (i = 0; i < m; i++) {
			for (g = 0; g < p; g++) {
				a[i][g] = scn.nextInt();// [a11] m=2
			} 							// [a21] p=2
		} 								// [a12]
										// [a22]
		System.out.println("請輸入B矩陣的數字");
		for (l = 0; l < n; l++) {
			for (g = 0; g < p; g++) {
				b[g][l] = scn.nextInt();
				// [b11] n=3
				// [b21]
				// [b12]
				// [b22]
				// [b13]
				// [b23]
			}
		}
		for (i = 0; i < m; i++) {
			for (l = 0; l < n; l++) {
				for (g = 0; g < p; g++) {
					c[g][l] = c[g][l] + a[i][g] * b[g][l];
				}
				System.out.print(c[i][l] + "\t");
			}
			System.out.println();
		}
	}

}
