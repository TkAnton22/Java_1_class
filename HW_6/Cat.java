class Cat extends Animal {
    Cat(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
    @Override
    public String swim(int distance) {
        return getClassName() + " cant swim";
    }
}