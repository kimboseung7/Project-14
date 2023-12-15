package main.quiz;

public class Qz4 {

	public static void main(String[] args) {

		try {
				String str = "1.23";
		int num = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상 종료됩니다");
	}

}
