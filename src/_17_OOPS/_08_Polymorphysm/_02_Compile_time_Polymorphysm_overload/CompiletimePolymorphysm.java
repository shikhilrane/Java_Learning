package _17_OOPS._08_Polymorphysm._02_Compile_time_Polymorphysm_overload;

public class CompiletimePolymorphysm {
    public static void main(String[] args) {
        Data d = new Data();
        d.print(4);
    }
}

class Data {
    int i;
    public void print(){
        System.out.println(i);
    }
    public void print(int a){
        System.out.println(a);
    }
}

// Method Overloading is called compile time polymorphysm.