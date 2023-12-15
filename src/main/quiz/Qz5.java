package main.quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Qz5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		try {
			
			int num = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("프로그램이 정상 종료됩니다");
		}
		
	}

}
