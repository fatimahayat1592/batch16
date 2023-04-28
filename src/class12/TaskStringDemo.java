package class12;

public class TaskStringDemo {
    public static void main(String[] args) {
        String userName="Fatima";
        String passWord="pass123";
        String confirmPassWord="pass123";
        if(userName.isEmpty() && passWord.isEmpty()){
            System.out.println("Username and password can not be empty");
        }else if(passWord.length()<8){
            System.out.println("Password is too short");
        }else if(passWord.contains(userName)){
            System.out.println("password can not contain username");
        }else if(passWord.equals(confirmPassWord)){
            System.out.println("password do not match");
        }else {
            System.out.println("Your username and password has been created");
        }
    }
}
