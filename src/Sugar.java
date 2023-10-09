public class Sugar extends Addon{
    Coffee coffee;
    public Sugar(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return coffee.cost() + 50;
    }

    @Override
    public String desc() {
        return coffee.desc() + " + sugar";
    }
}
