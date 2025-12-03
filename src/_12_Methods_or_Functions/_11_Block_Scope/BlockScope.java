package _12_Methods_or_Functions._11_Block_Scope;

// block scope
// anything inside {} comes under block scope
// It defines accessibility of variable outside block

public class BlockScope {
    public static void main(String[] args) {
        int a = 65;
        {
            int b = 32;
            System.out.println(a);
        }
        // System.out.println(b);
    }
}
