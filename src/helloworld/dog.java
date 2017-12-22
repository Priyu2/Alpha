package helloworld;

abstract class Animal {
	abstract void makeSound() ;
}


interface Toys {
	void getColour();
}


class dog extends Animal  implements Toys 
{
	public void getColour()
	{
		System.out.println("I m  Black");
	}
	
	public void makeSound() {
		System.out.println("Woof Woof");
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		dog a =new dog();
		a.getColour();
		a.makeSound();
	}
}