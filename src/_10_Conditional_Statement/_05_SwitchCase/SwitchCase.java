// switch cases are like you have to perform a particular task and you push relative button to that
// there are multiple cases but only one case can be get executed
// to stop execution after a particular case gets true, we need to use break; statement after every case
// we can use byte, char, string, short, int, long, float, double

package _10_Conditional_Statement._05_SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {
        int a = 2;

        switch (a) {                                   // we applied switch on the particular variable
            case 1:                                    // if value of variable matches with case name then it will execute & exit from switch
                System.out.println("you entered incorrect value");
                break;
            case 2:
                System.out.println("you entered correct value");
                break;
            default:
                System.out.println("come on, thats not in the list");
                break;
        }
    }
}