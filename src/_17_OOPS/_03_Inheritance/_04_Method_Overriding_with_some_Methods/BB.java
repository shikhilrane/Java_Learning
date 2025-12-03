// child class of class AA and parent class of class CC

public class BB extends AA{
    String color;
    void move(){
        System.out.println(this + " reference of Object using this");     // it shows reference of current Object using this keyword
        System.out.println(this.name + " BB is moving fast");             // it is property we defined in parent class of BB i.e. in class AA
        System.out.println(this.color + " BB is moving");                 // it is property we defined in this class
    };
    public static void main(String[] args) {
        BB secondClass = new BB();
        System.out.println(secondClass + " reference of Object from print statement");  // it shows reference of Object secondClass
        secondClass.name = "Class BB,";                              // assigned value to property from class BB's parent class i.e. in class AA
        secondClass.color = "blue";                                  // assigned value to property that we defined in this class
        secondClass.move();                                          // called a method
    }
}
