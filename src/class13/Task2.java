package class13;

public class Task2 {
    public static void main(String[] args) {
        String str="asffgFGHYYTG1234$%^$^^";

        System.out.println(str.replaceAll("[^a-zA-Z0-9]","").length());



    }
}
