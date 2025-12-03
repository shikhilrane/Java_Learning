package _12_Methods_or_Functions._05_Parameter_vs_Argument;

// parameters vs arguments
// parameters are in called method
// arguments are in calling method

public class ParametersArguments {
    public static void main(String[] args) {
        float multiplication = multi(12.54f, 6.8f);         // arguments or actual parameters
        System.out.println("Multiplication is " + multiplication);
    }
    public static float multi(float a, float b){            // parameters or formal parameters
        return a*b;
    }

}
