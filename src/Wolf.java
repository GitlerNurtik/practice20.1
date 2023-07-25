public class Wolf extends Predator implements Huntable{

    public Wolf(String name, String where, String food) {
        super(name, where, food);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" любит охотиться на "+getFood());
    }
}
