package Konstrukcyjne.Singleton;

public class Main {

	public static void main(String[] args) {
		Singleton singleton = Singleton.zwr��Instancj�();
		Singleton singleton2 = Singleton.zwr��Instancj�();
		
		System.out.println(singleton);
		System.out.println(singleton2);
	}

}
