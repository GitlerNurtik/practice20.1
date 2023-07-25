public abstract class Predator {
    private String name;
    private String where;
    private String food;

    @Override
    public String toString() {
        return getName()+" живёт в "+getWhere();
    }

    public String getName() {
        return name;
    }

    public String getWhere() {
        return where;
    }

    public String getFood() {
        return food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Predator(String name, String where, String food) {
        this.name = name;
        this.where = where;
        this.food = food;
    }
}
