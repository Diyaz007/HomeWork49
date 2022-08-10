import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Car> cars = new HashMap<>();
        cars.put(1,new Car("Мерседес",2020,"Чёрныё",150000));
        cars.put(2,new Car("БМВ",2001,"Чёрныё",2000));
        cars.put(3,new Car("Лексус",2018,"Чёрныё",80000));

        for (Integer car:cars.keySet()) {
            System.out.println(cars.get(car));
        }
    }
}
