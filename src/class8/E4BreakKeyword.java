package class8;

public class E4BreakKeyword {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i>5){
                break;
            }
            System.out.println(i);
            
        }
        System.out.println();
        int sum=0;
        for (int i = 0; i <50 ; i++) {
            sum=sum+i;
            if(i>=300){
                System.out.println(i);
                break;
            }


        }
    }
}
