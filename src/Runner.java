
public class Runner {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2016, 7500, "9999AS");
        System.out.println(car);

        Car carClone = null;
        try {
            carClone = car.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Не подерживается");
        }
        System.out.println(carClone);
    }
}
