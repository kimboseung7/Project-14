package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex6 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("src/main/a.txt"); //인자로 연결하고 싶은 파일 연결
			System.out.println(fis);	
		}catch (FileNotFoundException e) {
			e.printStackTrace(); //오류 메시지 출력
		}
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}
