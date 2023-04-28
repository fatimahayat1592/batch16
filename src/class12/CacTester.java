package class12;

public class CacTester {
    public static void main(String[] args) {
       Car car=new Car();
       car.make="Toyota";
       car.model="Camry";
       car.color="White";
       car.mileage=0;
       car.isAutomatic=true;
       car.startCar();
       car.turn();
       car.stopCar();
       Car car1=new Car();
       car1.make="Tesla";
       car1.model="s";
       car1.mileage=1200;
       car1.isAutomatic=true;
       car1.startCar();
       car1.turn();
       car1.stopCar();


    }
}
