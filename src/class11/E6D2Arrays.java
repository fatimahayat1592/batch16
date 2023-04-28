package class11;

public class E6D2Arrays {
    public static void main(String[] args) {
        int [][] arr={{10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}
        };
        int count=0;
        for (int[] ints : arr) {
            for (int anInt : ints) {

                count=count+anInt;

            }

            System.out.println(count);
            count=0;

        }

    }
}
