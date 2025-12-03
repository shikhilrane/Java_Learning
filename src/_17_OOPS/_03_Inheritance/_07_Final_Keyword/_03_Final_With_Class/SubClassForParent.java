public class SubClassForParent extends ParentClassFinal {
    void accelarate(){
        System.out.println("vehicle is accelarating so fast");
    }
    public static void main(String[] args) {
        SubClassForParent sfm = new SubClassForParent();
        sfm.accelarate();
    }
}
