package main;

public class Ex4 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			arr[5] = 5;
		} catch (ClassCastException exception) {
			System.out.println(exception);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상 종료됩니다");
	}

}
