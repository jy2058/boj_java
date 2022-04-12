package basic1.step300;
import java.util.Scanner;


// 나머지
public class boj_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        System.out.println((arr[0]+arr[1])%arr[2]);
        System.out.println(((arr[0]%arr[2])+(arr[1] % arr[2]))%arr[2]);
        System.out.println((arr[0] * arr[1])%arr[2]);
        System.out.println(((arr[0] % arr[2]) * (arr[1] % arr[2])) % arr[2]);
    }
}
