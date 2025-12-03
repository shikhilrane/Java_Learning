package _10_Conditional_Statement._07_Conditional_with_LogicalOps;

public class ConditionalLogical {
    public static void main(String[] args) {
        // Logical AND
        int time = 11;
        if ((time>=10)&&(time<=20)){
            System.out.println("Office is open");
        }
        else{
            System.out.println("office is closed");
        }

        // Logical OR
        int snackTime = 13;
        if ((snackTime==12) || (snackTime == 18)){
            System.out.println("Time to snacks");
        }
        else {
            System.out.println("Time for work");
        }
    }
}
