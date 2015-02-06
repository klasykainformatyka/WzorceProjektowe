package Konstrukcyjne.Singleton;

public class Main {

	public static void main(String[] args) {
		Singleton singleton = Singleton.zwróæInstancjê();
		Singleton singleton2 = Singleton.zwróæInstancjê();
		
		System.out.println(singleton);
		System.out.println(singleton2);
	}

}
