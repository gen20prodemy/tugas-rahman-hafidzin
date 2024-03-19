public class Test {

    public static void main(String[] args){
        int n =5 ;
        for(int i =1; i <= n; i++){
            for (int j = 1 ; j <= i; j++){
                if(j == i || j==n-i+1)
                    System.out.print("*");
                    System.out.print(" ");
                }
        System.out.println();
            }

    }}


