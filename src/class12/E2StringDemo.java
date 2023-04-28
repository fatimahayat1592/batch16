package class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String name="admin";
        String password="pass123";
        if(name.length()<8 && password.length()<8 ){
            System.out.println("Signup successful");
        }else{
            System.out.println("username and password can not be more than 8");
        }
    }
}
