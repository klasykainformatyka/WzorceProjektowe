package Konstrukcyjne.Singleton;

public class Singleton {
	
	private static Singleton instancjaSingletona;
	
	private Singleton() {}
	
	public static Singleton zwróæInstancjê() {
		if (instancjaSingletona == null)
			instancjaSingletona = new Singleton();
		return instancjaSingletona;
	}

}
