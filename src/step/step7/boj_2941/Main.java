package step.step7.boj_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// 크로아티아 알파벳의 갯수를 세는 문제
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int len = s.length();
		int cnt = 0;
		for(int i=0; i < len; i++){

			char ch = s.charAt(i);
			// 다음 인덱스가 존재할때만
			if(ch == 'c' && i < len-1){
				if(s.charAt(i+1) == '=' || s.charAt(i+1)== '-') {
					i++;	// 다음 인덱스를 이미 검색했으니까 i 증가
				}
			}else if(ch == 'd'&& i < len-1){
				if(s.charAt(i+1) == 'z' && i < len-2) {
					// 인덱스 두개 필요하니까 length -2
					if(s.charAt(i+2) == '=' ){
						i+=2;
					}
				}else if(s.charAt(i+1) == '-'){
					i++;
				}
			}else if((ch == 'l' || ch == 'n' ) &&  i < len-1){
				if(s.charAt(i+1) == 'j') {
					i++;
				}
			}else if((ch == 's'  || ch == 'z' ) && i < len-1) {
				if (s.charAt(i+1) == '=') {
					i++;
				}
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
