package class13;

public class ArrayUtil {
    public static void main(String[] args) {
        int [] arr={10,20,45,89};
        int number=100;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==number){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
