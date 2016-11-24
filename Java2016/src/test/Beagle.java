package test;

public class Beagle extends Dog{
public static void main(String[] args) {
	Pet a = new Dog();
	Dog d = new Beagle();
	Pet e = new Beagle();
}

}

interface Pet{
	
}

class Dog implements Pet{
	
}
