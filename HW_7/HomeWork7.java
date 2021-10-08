import java.util.Scanner;
class HomeWork7 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        int action;
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Барсик", 5, false);
        cats[1] = new Cat("Мурзик", 20, false);
        cats[2] = new Cat("Васька", 7, false);
        cats[3] = new Cat("Кузя", 40, false);
        Plate plate = new Plate(0);
        System.out.println("Сколько еды положить в тарелку?");
        action = sc.nextInt();
        plate.increaseFood(action);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
            System.out.println("Сколько добавить еще в тарелку?");
            action = sc.nextInt();
            plate.increaseFood(action);
        System.out.println(plate);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}