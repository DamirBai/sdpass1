public class Caramel extends Addon{
    Coffee coffee;
    public Caramel(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String desc() {
        return this.coffee.desc() + " + caramel syrup";
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 350;
    }
}
