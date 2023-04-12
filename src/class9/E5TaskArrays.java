package class9;

public class E5TaskArrays {
    public static void main(String[] args) {

        for (int i = 0; i <=5 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        char [] symbols={'a','b','c','d','e'};
        for (int i = 0; i < symbols.length; i+=2) {
            System.out.print(symbols[i]+" ");

        }
    }
}
