package poly;
//there are three classes here.... parent class is animals and the 'dog' and 'cat' are both child of animal class
public class Animals {
	public void makeNoise()
    {
        System.out.println("Some sound");
    }
}
 
class Dog extends Animals{//inherited class
    public void makeNoise()
    {
        System.out.println("Bark");
    }
}
 
class Cat extends Animals{//inherited class
    public void makeNoise()
    {
        System.out.println("Meawoo");
    }
}


