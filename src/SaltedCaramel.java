public class SaltedCaramel extends Addon{
    Coffee coffee;
    public SaltedCaramel(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public int cost() {
        return this.coffee.cost() + 350;
    }

    @Override
    public String desc() {
        return this.coffee.desc() + " + salted caramel syrup";
    }
}
