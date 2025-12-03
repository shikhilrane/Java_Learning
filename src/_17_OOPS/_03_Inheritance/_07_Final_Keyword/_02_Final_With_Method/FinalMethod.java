public class FinalMethod {
    final void accelarate(){
        System.out.println("Vehicle is accelarating");
    }
    public static void main(String[] args) {
        FinalMethod car = new FinalMethod();
        car.accelarate();
    }
}