package DesignPatterns;

public class Test {
	public static void main(String[] args) {
		Singleton obj = Singleton.getSingletonObject();
		Singleton obj1 = Singleton.getSingletonObject();
		Singleton obj2 = Singleton.getSingletonObject();
	}
}
