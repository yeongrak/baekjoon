package step1;

import java.util.Scanner;

/*
 * 문제
 * -두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력
 * -첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력
 * -첫째 줄에 A+B를 출력한다.
 */

public class Main1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A > 0 && B < 10) {
            System.out.println(A + B);
        }
    }
}
