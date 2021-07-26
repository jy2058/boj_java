package step.step7.boj_5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	// 다이얼: 규칙에 따라 문자에 대응하는 수를 출력하는 문제
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int cnt = 0;
		for(int i=0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'A': case 'B': case 'C':
				cnt+=3;
				break;
			case 'D': case 'E': case 'F':
				cnt+=4;
				break;
			case 'G': case 'H': case 'I':
				cnt+=5;
				break;
			case 'J': case 'K': case 'L':
				cnt+=6;
				break;
			case 'M': case 'N': case 'O':
				cnt+=7;
				break;
			case 'P': case 'Q': case 'R': case 'S':
				cnt+=8;
				break;
			case 'T': case 'U': case 'V':
				cnt+=9;
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				cnt+=10;
				break;
			default:
				break;
			}
		}
		System.out.println(cnt);
		
		/*
		 * 다른사람 풀이
		 * 
       	for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= 'C') total += 2;
            else if (str.charAt(i) <= 'F') total += 3;
            else if (str.charAt(i) <= 'I') total += 4;
            else if (str.charAt(i) <= 'L') total += 5;
            else if (str.charAt(i) <= 'O') total += 6;
            else if (str.charAt(i) <= 'S') total += 7;
            else if (str.charAt(i) <= 'V') total += 8;
            else if (str.charAt(i) <= 'Z') total += 9;
        }
		 */
	}
}
