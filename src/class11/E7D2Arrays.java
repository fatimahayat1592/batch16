package class11;

public class E7D2Arrays {
    public static void main(String[] args) {
        boolean [][] arr2D={
                {true,false,true,true,false},
                {true,false,false,false,false}
        };
        int count=0;
        for (int i = 0; i <arr2D.length ; i++) {
            for (int j = 0; j <arr2D[i].length ; j++) {
                if(arr2D[i][j]==true){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
