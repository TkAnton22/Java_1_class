class Cat {
     String name;
     int apetite;
     boolean fullness;
    Cat(String name, int apetite, boolean fullness) {
        this.name = name;
        this.apetite = apetite;
        this.fullness = fullness;
    }
        String getName() {
        return name;
    }
        int getApetite() {
        return apetite;
    }
    boolean getFullness() {
        return fullness;
    }
    public void eat(Plate r) {
        if (!fullness) {
            fullness = r.decreaseFood(apetite);
        }
    }
    @Override
    public String toString() {
        if(fullness) {
            return ("Котик " + name + " поел и теперь сыт!");
        } else {
            return ("Котик " + name + " не поел!");
        } /* else {
            return ("Котик " + name + " сыт!");
        } */
    }
}