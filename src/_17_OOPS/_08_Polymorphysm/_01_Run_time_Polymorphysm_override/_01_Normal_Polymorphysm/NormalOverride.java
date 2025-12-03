package _17_OOPS._08_Polymorphysm._01_Run_time_Polymorphysm_override._01_Normal_Polymorphysm;

public class NormalOverride {
    public static void main(String[] args) {
        ChildData d = new ChildData();
        d.print();
    }
}

class Data {
    int i;
    public void print(){
        System.out.println(i);
    }
}

class ChildData extends Data{
    @Override   
    public void print(){
        System.out.println("Override data " + i);
    }
}

/*
    1. Here we will print only method of child data as we have override it
 */