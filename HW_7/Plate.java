class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
        int getFood() {
        return food;
    }
         void setFood(int food) {
        this.food = food;
    } 
    boolean decreaseFood(int foods) {
        if (food < foods) {
            return false;
        }
        this.food -= foods;
        return true;
    }
    public void increaseFood(int x) {
        food += x;
    }
        @Override
    public String toString() {
        return "Всего в тарелке: " + food;
    }
}