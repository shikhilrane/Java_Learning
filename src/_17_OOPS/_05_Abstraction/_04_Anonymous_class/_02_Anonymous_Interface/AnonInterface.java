package _17_OOPS._05_Abstraction._04_Anonymous_class._02_Anonymous_Interface;

public class AnonInterface {
    public static void main(String[] args) {
        SuperInterface obj = new SuperInterface() {     // 3
            @Override
            public void interfaceMethod() {             // 4
                SuperInterface.super.interfaceMethod();
                System.out.println("Override, This is interface");  //5
            }
        };
        obj.interfaceMethod();                          // 6
    }
}

interface SuperInterface{                               // 1
    default void interfaceMethod(){                     // 2
        System.out.println("This is Interface");
    }
}

/*
    1. We can only make anonymous interface when we want to create a sub-interface for anonymous interface
    2. We can make a normal type of inner interface as well but as we gave the name SuperInterface so it doesn't consider as anonymous interface
    3. We don't need to give name to sub-interface here.
    4. Syntax to write anonymous interface, OuterInterface_Name Object_name = new OuterInterface_Name(){};
    5. We don't need to parent extend interface to child interface.
    6. While creating anonymous interface, we have to use {} and write our overridden code of parent interface in it, after ()
    7. This type of interface can be created when we want to use sub-interface only single time
    8. It creates anonymous interface in files too with $ symbol
    9. It is similar to extending parent interface to child interface
   10. We can't make multiple object of anonymous interface (can't make object of SuperInterface obj = new SuperInterface(){})
   11. it does't have any physical present, it just come in memory and works and leave the memory

    Execution of code :
        1. Made a parent interface
        2. Add method in it
        3. Made a sub-interface (it looks like it is a object but actually it a sub-interface of SuperInterface without a name).
        4. Called a method from SuperInterface
        5. Override SuperInterface content.
        6. Called a method.
        7. interface name AnonInterface$1.interface is anonymous interface
*/