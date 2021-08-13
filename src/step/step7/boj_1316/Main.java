package step.step7.boj_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// 그룹단어체커 : 조건에 맞는 문자열을 찾는 문제
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {

		int num = Integer.parseInt(br.readLine());
		int cnt = 0;

		for(int i=0; i<num; i++){
			if(check()){
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	// 문자 중복 체크 메서드
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int pre = 0;
		String str = br.readLine();
		for(int i=0; i<str.length(); i++){
			int now = str.charAt(i);
			if(pre != now){	// 이전 문자와 현재문자가 다를 때
				// 배열에 현재 문자가 들어가있지 않으면(false) true로 변경 후 현재 문자를 이전문자에 저장
				// 현재 문자가 들어있으면 더 확인 필요없이 종료
				if(!check[now -'a']){
					check[now -'a'] = true;
					pre = now;
				}else{
					return false;
				}
			}
		}
		return true;
	}
}
