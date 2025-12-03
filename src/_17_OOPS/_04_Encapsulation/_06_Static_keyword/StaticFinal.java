// 5

package _17_OOPS._04_Encapsulation._06_Static_keyword;

public class StaticFinal {
    public static final float gravitationaForce = 9.81f;
    public static final void statement (){
        System.out.println("You can't change it");
    }

    public static void main(String[] args) {
        System.out.println(StaticFinal.gravitationaForce);
//        StaticFinal.gravitationaForce = 11.11;            // we used final keyword here so can't change value of static variable value with final value
        StaticFinal.statement();
    }
}

/*
    1. changing static variable value is not good practice. as we now final keyword doesn't let you change value
*/
