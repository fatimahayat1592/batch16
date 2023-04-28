package class12;

public class E10StringDemo {
    public static void main(String[] args) {
        String name = "LEANDRO";
        int count = 0;


        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'R') {
                count++;

            }
        }
        System.out.println(count);
    }
}