package main.quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Qz7 {

	public static void main(String[] args) {
		//숫자 목록 생성
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		Iterator<Integer> iterator = set.iterator(); 
		try {
		int num1 = iterator.next();
		int num2 = iterator.next();
		int num3 = iterator.next();
		int num4 = iterator.next(); //꺼낼 요소가 없음
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}

}
