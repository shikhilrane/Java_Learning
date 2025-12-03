package _10_Conditional_Statement._07_Questions._01_Comparing3Nums;

public class CompThreeNums {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 16;

        if (a > b) {
            System.out.println("A is bigger than B");
            if (a>c){
                System.out.println("A is bigger than C");
                System.out.println("A is larger amongst all " + a);
            }else{
                System.out.println("C is bigger than A");
                System.out.println("C is larger amongst all " + c);
            }
        }
        else{
            System.out.println("B is bigger than A");
            if (b>c){
                System.out.println("B is bigger than C");
                System.out.println("B is Largest amongst all " + b);
            }
            else{
                System.out.println("C is bigger than B");
                System.out.println("C is larger amongst all " + c);
            }
        }
    }
}
