package class8;

public class E5WhileLoop {
    public static void main(String[] args) {
        boolean summer=true;
        int temp=85;
        while(summer){
            if(temp<100){
                System.out.println("Good day");
            }else{
                System.out.println("its hot");
                break;
            }
            temp=temp+3;
        }
    }
}
