package class12;

public class DogTester {
    public static void main(String[] args) {
        Dog actualDog=new Dog();
        actualDog.name="Jacky";
        actualDog.age=15;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;
        actualDog.bark();

        Dog obj=new Dog();
        obj.name="Tiger";
        obj.age=12;
        obj.breed="German";
        obj.color="White";
        obj.weight=25;
        obj.isFat=true;
        obj.sleep();
    }
}
