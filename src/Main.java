public class Main {
    public static void main(String[] args) {
        int base = 2;
        int power = 5;
        int ans = 1;
        int i = 1;
        while (i<=power){
            ans = ans * base;
            i++;
        }

        System.out.println(ans);
    }
}