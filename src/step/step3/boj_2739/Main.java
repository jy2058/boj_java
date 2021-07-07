package step.step3.boj_2739;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", a, i, a*i);
		}
	}
}
