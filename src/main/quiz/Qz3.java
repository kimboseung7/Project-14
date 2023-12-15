package main.quiz;

public class Qz3 {

	public static void main(String[] args) {
//		Object obj = new Integer(0);
//		String str = (String) obj;
		try {
			Object obj = new Integer(0);
			String str = (String) obj;
		} catch (ClassCastException e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상 종료됩니다");
	}

}
