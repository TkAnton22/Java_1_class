abstract class Animal implements IAnimal {
    public int runLimit;
    public int swimLimit;
    private String className;
    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass() .getSimpleName();
    }
    public String getClassName() {
        return className;
    }
    @Override
    public String run(int distance) {
        if(distance > runLimit) {
            return className + " cant run " + distance  + "m";
        } else {
            return className + " ran " + distance + "m";
        }
    }
    @Override
    public String swim(int distance) {
        if(distance > swimLimit) {
            return className + " cant swim " + distance  + "m";
        } else {
            return className + " swim " + distance + "m";
        }
    }
    @Override
    public String toString() {
        return className + " runLimit- " + runLimit + "m," + " swimLimit- " + swimLimit + "m";
    }
}