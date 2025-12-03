// child class of class BB

public class CC extends BB{
    public static void main(String[] args) {
        CC thirdClass = new CC();
        System.out.println(thirdClass);         // it will show reference of this class
        thirdClass.name = "Class CC";           // property from class AA
        thirdClass.color = "Black";             // property from class BB
        thirdClass.move();                      // it will executes method from its parents class BB, but with different values for properties.
        thirdClass.letters = 2;                 // assigned value to property of class AA, because CC is child of BB, and BB is child of AA
        System.out.println("Executed property of class AA, as we have set value for int letters = " + thirdClass.letters); // Executed property of class AA, as we have set value for int letters = 2
    }
}