import java.util.Scanner;

public class array2D_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���X��ǥ�");
		int n = scn.nextInt();
		String name[] = new String[n];
		System.out.println("�п�J���X�즨�Z");
		int m = scn.nextInt();
		float b[][] = new float[n + 1][m + 1];
		float sum = 0;
		int i = 0;
		int j = 0;
		int p = 0;
		for (i = 0; i < n; i++) {
			System.out.println("�п�J��" + (i + 1) + "�ǥͦW�r�ΦU�즨�Z");
			name[i] = scn.next();
			for (j = 0; j < m; j++) {
				b[i][j] = scn.nextFloat();
				sum = sum + b[i][j];
			}
			b[i][m] = sum / m;
			sum = 0;
		}
		for (i = 0; i < n; i++) {
			if (b[i][m] < 60) {
				p++;
			}
		}
		System.out.println("���Z��Ʀp�U");
		for (i = 0; i < n; i++) {
			System.out.print(name[i] + "\t");
			for (j = 0; j < m + 1; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("���ή�H��" + p);
		float Max = b[0][0];
		for (i = 0; i < n; i++) {
			for (j = 0; j < m + 1; j++) {
				Max = Math.max(Max, b[i][j]);
			}
		}
		System.out.println("Max=" + Max);
		float min = b[0][0];
		for (i = 0; i < n; i++) {
			for (j = 0; j < m + 1; j++) {
				min = Math.min(min, b[i][j]);
			}
		}
		System.out.println("min=" + min);
	}

}
