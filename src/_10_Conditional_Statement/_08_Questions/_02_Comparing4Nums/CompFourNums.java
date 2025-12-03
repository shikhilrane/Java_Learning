package _10_Conditional_Statement._07_Questions._02_Comparing4Nums;

public class CompFourNums {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int c = 9;
        int d = 18;

        if (a > b) {
            System.out.println("A is bigger than B");
            if (a>c){
                System.out.println("A is bigger than C");
                if (a>d){
                    System.out.println("A is bigger than D");
                    System.out.println("A is larger amongst all " + a);
                }
                else{
                    System.out.println("D is bigger than A");
                    System.out.println("D is larger amongst all " + d);
                }
            }
            else if (c>d){
                System.out.println("C is bigger than D");
                System.out.println("C is larger amongst all " + c);
            }
            else {
                System.out.println("D is bigger than A and C");
                System.out.println("D is larger amongst all " + d);
            }
        }
        else{
            System.out.println("B is bigger than A");
            if (b>c){
                System.out.println("B is bigger than C");
                if (b>d){
                    System.out.println("B is bigger than D");
                    System.out.println("B is larger amongst all " + c);
                }
            }
            else if (c>d){
                System.out.println("C is bigger than D");
                System.out.println("C is larger amongst all " + c);
            }
            else {
                System.out.println("D is bigger than B and C");
                System.out.println("D is larger amongst all " + d);
            }
        }
    }
}
