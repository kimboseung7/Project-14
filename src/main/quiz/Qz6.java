package main.quiz;

public class Qz6 {

	public static void main(String[] args) {

		try {
			Book book = new Book();
		} catch (NoClassDefFoundError e) {
			System.out.println(e);
		}
	}

}

class Book {

}
