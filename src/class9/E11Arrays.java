package class9;

public class E11Arrays {
    public static void main(String[] args) {
        int [] numbers=new int[5];
        numbers [2]=50;
        numbers [0]=100;
        numbers [1]=10;
        numbers [3]=20;
        numbers [4]=40;
        for (int number : numbers) {
            System.out.println(number);

        }
    }
}
