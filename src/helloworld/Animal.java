package helloworld;

//abstract parent class
abstract class Animal
{
//abstract method
public abstract void makesound();
}
//toy class extends Animal class
public class Toy extends Animal
{

public void makesound()
{
	System.out.println("Woof Woff");
}
public static void main(String args[])
{
	Animal obj = new Toy();
	obj.makesound();
}
}

