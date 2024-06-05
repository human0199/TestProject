public class Loop2 {
    public static void main(String[] args) {
        for(int i =1; i<5;i++){
            System.out.println("Value of i:"+1);
            for(int j =1; j<4; j++){
                System.out.println("Value of j:"+j);
            }
        }for(int i =1; i<8;i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
        }
            System.out.println();
    }
}
