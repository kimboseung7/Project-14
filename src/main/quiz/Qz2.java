package main.quiz;

public class Qz2 {

	public static void main(String[] args) {
//		String s = null;
//		System.out.println(s.length());
//		System.out.println("프로그램이 정상 종료합니다");

		try {
			String s = null;
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상 종료합니다");
	}

}
