public class Lion extends Predator implements Huntable{
    public Lion(String name, String where, String food) {
        super(name, where, food);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" любит охотиться на "+getFood());
    }
}
