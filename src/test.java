public class test {
    public static void main(String[] args) {

        for(int a =1; a<10; a++) {

            if(a % 2 == 0){
                for(int b=1; b<=9; b++) {
                    int c = a*b;
                    System.out.printf("%d*%d = %d ",a,b,c);
                }
                System.out.println();
            }
        }
    }
}
