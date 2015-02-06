package Konstrukcyjne.Singleton;

public class Singleton {
	
	private static Singleton instancjaSingletona;
	
	private Singleton() {}
	
	public static Singleton zwr��Instancj�() {
		if (instancjaSingletona == null)
			instancjaSingletona = new Singleton();
		return instancjaSingletona;
	}

}
