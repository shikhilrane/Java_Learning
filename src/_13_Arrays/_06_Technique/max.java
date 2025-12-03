package _13_Arrays._06_Technique;

public class max {
    public static void main(String[] args) {
        int ages[][] = {                    
            {43,65,76,65,11},
            {30,81,23,43,22},
            {14,77,92,65,33}
        };
        System.out.println(maxNumFL(ages));
    }

    public static int maxNumFL(int getMax[][]){
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < getMax.length; i++) {
            for (int j = 0; j < getMax.length; j++) {
                if (maxNum<getMax[i][j]) {
                    maxNum=getMax[i][j];
                }
            }
        }
        return maxNum;
    }    
}
