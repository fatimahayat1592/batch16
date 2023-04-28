package class13;

public class ArrayU2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 67};
        int[] arr1 = {12, 13, 34, 34};
        int[] arr2 = {120, 656, 767, 878,};
        int num = 100;
        int num1 = 10;
        int num2 = 20;
        ArrayU2 ivana = new ArrayU2();
        ivana.searchArray();
    }
    void searchArray(int[]arr,int number){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==number){
                System.out.println("yes");
                break;
            }
        }
    }

