package main.quiz;

public class Qz1 {

	public static void main(String[] args) {

		try {
			int num = 0 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상 종료됩니다");
	}

}
