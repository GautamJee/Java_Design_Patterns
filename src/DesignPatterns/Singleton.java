/*
 * Singleton - Creational Design Pattern 
 * 
 * provides only one instance of a class
 * usage example in DB connection
 */

package DesignPatterns;

public final class Singleton { //Singleton Class
	static Singleton obj = null;
	  
	Singleton()
	{
		
	}
	
	static synchronized public Singleton getSingletonObject() //factory method
	{
		//used synchronized for multi-threading
		
		if(obj==null) //if object not exists then create
			obj = new Singleton();
		return obj;
	}
}
