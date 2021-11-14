package step.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 정렬 - 나이순 정렬
public class boj_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        Person[] person = new Person[N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            person[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(person, (s1, s2) -> s1.age - s2.age);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(person[i]);
        }

        System.out.println(sb);

    }

    private static class Person {
        int age;
        String name;

        public Person(){};

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }
}
