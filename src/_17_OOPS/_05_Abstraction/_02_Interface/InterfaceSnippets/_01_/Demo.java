package _17_OOPS._05_Abstraction._02_Interface.InterfaceSnippets._01_;

public class Demo {
    public static void main(String[] args) {
        Payment p = new DebitCard();
        p.pay();
    }
}

//polymorphism

interface Payment {
    void pay();
}

class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying via credit card");
    }
}

class DebitCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying via debit card");
    }
}

/*
    Interface Polymorphism Notes:
        1. Payment is an interface.
        2. CreditCard and DebitCard implement the Payment interface.
        3. Payment p = new DebitCard();
           - Reference type is Payment.
           - Object type is DebitCard.
        4. This is Runtime Polymorphism (Dynamic Method Dispatch).
        5. At compile time, Java checks whether pay() exists in Payment.
        6. At runtime, Java calls DebitCard's overridden pay() method.
        7. Using an interface allows us to switch implementations without changing the reference type.

    Execution:
        1. Create a DebitCard object.
        2. Store its reference in a Payment variable.
        3. Call p.pay().
        4. JVM executes DebitCard's pay() method.
        5. Output: Paying via debit card.
*/