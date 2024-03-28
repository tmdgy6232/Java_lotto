import java.util.Scanner;

public class forExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("몇 단을 하실 계획인가요? : ");
        int input = sc.nextInt();
        System.out.println();
        System.out.print("몇 줄까지 곱셈을을 하실 계획인가요? : ");
        int input2 = sc.nextInt();
        System.out.println("input = " + input);

        for (int i=1; i<=input; i++){
            System.out.println("==================================");
            for (int j=1; j<= input2; j++ ){
                System.out.println(i +" X " + j + " = " + i*j);
            }
        }

       // 구구단
       /*
       *
       *  solution 1 9x9
       *
       *  1X1 = 1
       *  1X2 = 2
       *
       *
       *  solution 2 9x9
       *
       *  1X1 = 1
       *  2X1 = 2
       * */

    }
}
