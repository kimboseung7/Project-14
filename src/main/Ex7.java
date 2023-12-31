package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex7 {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("src/main/a.txt");
			System.out.println("a.txt 파일을 엽니다");

			// 중간에 숫자를 나누는 코드를 삽입
			int i = 0 / 0; // ArithmeticException 에러 발생 -> 리소스를 닫는 코드가 실행 안됨

			// 파일을 사용하고 나서 스트림을 닫아야 함
			try {
				fis.close();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			System.out.println("사용한 리소스를 닫았습니다");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			System.out.println("사용한 리소스를 닫았습니다");
		}
		
		// finally문을 사용하여 변경
//		FileInputStream fis = null;
//
//		try {
//
//			fis = new FileInputStream("src/main/a.txt");
//			System.out.println("a.txt 파일을 엽니다");
//
//			int i = 0 / 0;
//
//		} catch (FileNotFoundException fileNotFoundException) {
//			fileNotFoundException.printStackTrace();
//			
//		} catch (ArithmeticException arithmeticException) {
//			arithmeticException.printStackTrace();
//			
//		} finally { // finally 블록은 예외 발생여부와 상관없이 항상 수행됨
//			// 스트림 닫기
//			try {
//				fis.close();
//			} catch (IOException exception) {
//				exception.printStackTrace();
//			}
//			System.out.println("사용한 리소스를 닫았습니다");
//		}

	}
	}
}