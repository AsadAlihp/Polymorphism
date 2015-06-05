package poly;

public class MainClass//	THIS IS THE MAIN CLASS BECAUSE YOUR MAIN FUNCTION IS IN HERE...:
{
    public static void main(String[] args) {
        Animals a1 = new Cat();		//CREATING OBJECT OF ANIMAL CLASS OF THE TYPE OF CAT.
        a1.makeNoise(); //Prints Meowoo			NOW USING A1 object we call the method makenoise which is in other class.
         
        Animals a2 = new Dog();			//second object of animal class of type of dogs....:
        a2.makeNoise(); //Prints Bark		now using that object we are calling another method which is in another class of animals inherited..
    }
}
/*
 * 
 * 
 * Asad Ali
 * Time and date:- 7:20pm   [20 fab 2015]
 * 

 * */
 