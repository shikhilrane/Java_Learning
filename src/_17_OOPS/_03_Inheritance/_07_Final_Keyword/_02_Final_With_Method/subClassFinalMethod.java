public class subClassFinalMethod extends FinalMethod{
    // void accelarate(){                // we can't override this method as we have used final keyword with accelarate(); in its parent class
    //     System.out.println("vehicle is accelarating so fast");
    // }
    public static void main(String[] args) {
        subClassFinalMethod sfm = new subClassFinalMethod();
        sfm.accelarate();               // but we can access the method from its parent class which is finalised
    }
}