public class Cream extends Addon{
    Coffee coffee;
    public Cream(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 350;
    }

    @Override
    public String desc() {
        return this.coffee.desc() + " + liquid cream";
    }
}
