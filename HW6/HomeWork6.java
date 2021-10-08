class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat(200, 0);
        Dog dog = new Dog(500, 10);
        IAnimal[] animals = {cat, dog};
        for(IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(200));
            System.out.println(animal.run(500));
            System.out.println(animal.run(600));
            System.out.println(animal.swim(9));
            System.out.println(animal.swim(11));
        }
    }
}