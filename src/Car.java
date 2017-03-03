
public class Car implements Cloneable {
    private String name;
    private int age;
    private double cost;
    private String number;

    public Car(String name, int age, double cost, String number) {
        this.name = name;
        this.age = age;
        this.cost = cost;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Car clone() throws CloneNotSupportedException {
        return(Car) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (age != car.age) return false;
        if (Double.compare(car.cost, cost) != 0) return false;
        if (!name.equals(car.name)) return false;
        return number.equals(car.number);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + age;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + number.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cost=" + cost +
                ", number='" + number + '\'' +
                '}';
    }
}
