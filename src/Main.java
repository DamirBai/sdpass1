import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static int addonMenu(int ch1){
        int ch2;
        Coffee coffee;
        boolean menu = true;
        while(menu){
            System.out.println("What do you want to add?");
            System.out.println("1. Caramel syrup ------> 350 tg");
            System.out.println("2. Salted caramel syrup ------> 350 tg");
            System.out.println("3. Sugar ------> 50 tg");
            System.out.println("4. Cream ------> 350 tg");
            System.out.println("5. Cream + caramel syrup ------> 700 tg");
            System.out.println("6. Cream + salted caramel syrup ------> 700 tg");
            System.out.println("7. Cream + sugar ------> 400 tg");
            System.out.println("8. Caramel syrup + sugar ------> 400 tg");
            System.out.println("9. Salted caramel syrup + sugar ------> 400 tg");
            System.out.println("0. Return back to coffee menu");
            ch2 = sc.nextInt();
            if(ch2 == 0) return 0;
            else if (ch2 == 1) {
                if(ch1 == 1){
                    coffee = new Caramel(new Latte());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 2){
                    coffee = new Caramel(new Americano());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 3){
                    coffee = new Caramel(new Mocha());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else{
                    coffee = new Caramel(new Cappuccino());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                return 1;
            }
            else if(ch2 == 2) {
                if(ch1 == 1){
                    coffee = new SaltedCaramel(new Latte());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 2){
                    coffee = new SaltedCaramel(new Americano());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 3){
                    coffee = new SaltedCaramel(new Mocha());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else{
                    coffee = new SaltedCaramel(new Cappuccino());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                return 1;
            }
            else if(ch2 == 3) {
                if(ch1 == 1){
                    coffee = new Sugar(new Latte());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 2){
                    coffee = new Sugar(new Americano());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 3){
                    coffee = new Sugar(new Mocha());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else{
                    coffee = new Sugar(new Cappuccino());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                return 1;
            }
            else if(ch2 == 4){
                if(ch1 == 1){
                    coffee = new Cream(new Latte());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 2){
                    coffee = new Cream(new Americano());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 3){
                    coffee = new Cream(new Mocha());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else{
                    coffee = new Cream(new Cappuccino());
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                return 1;
            }
            else if(ch2 == 5){
                if(ch1 == 1){
                    coffee = new Caramel(new Cream(new Latte()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 2){
                    coffee = new Caramel(new Cream(new Americano()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 3){
                    coffee = new Caramel(new Cream(new Mocha()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else{
                    coffee = new Caramel(new Cream(new Cappuccino()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                return 1;
            }
            else if(ch2 == 6){
                if(ch1 == 1){
                    coffee = new SaltedCaramel(new Cream(new Latte()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 2){
                    coffee = new SaltedCaramel(new Cream(new Americano()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 3){
                    coffee = new SaltedCaramel(new Cream(new Mocha()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else{
                    coffee = new SaltedCaramel(new Cream(new Cappuccino()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                return 1;
            }
            else if(ch2 == 7){
                if(ch1 == 1){
                    coffee = new Sugar(new Cream(new Latte()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 2){
                    coffee = new Sugar(new Cream(new Americano()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 3){
                    coffee = new Sugar(new Cream(new Mocha()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else{
                    coffee = new Sugar(new Cream(new Cappuccino()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                return 1;
            }
            else if(ch2 == 8){
                if(ch1 == 1){
                    coffee = new Sugar(new Caramel(new Latte()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 2){
                    coffee = new Sugar(new Caramel(new Americano()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 3){
                    coffee = new Sugar(new Caramel(new Mocha()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else{
                    coffee = new Sugar(new Caramel(new Cappuccino()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                return 1;
            }
            else if(ch2 == 9){
                if(ch1 == 1){
                    coffee = new Sugar(new SaltedCaramel(new Latte()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 2){
                    coffee = new Sugar(new SaltedCaramel(new Americano()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else if(ch1 == 3){
                    coffee = new Sugar(new SaltedCaramel(new Mocha()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                else{
                    coffee = new Sugar(new SaltedCaramel(new Cappuccino()));
                    System.out.println(coffee.desc());
                    System.out.print("Cost: " + coffee.cost() + "tg");
                }
                return 1;
            }
            else{
                System.out.println("Choose correct option!");
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        boolean menu = true;
        int ch1;
        System.out.println("Welcome to Starbucks!");
        System.out.println("Note: to choose options type numbers in terminal");
        while(menu){
            System.out.println("Choose coffee:");
            System.out.println("1. Latte ------> 1600 tg");
            System.out.println("2. Americano ------> 1300 tg");
            System.out.println("3. Mocha ------> 1700 tg");
            System.out.println("4. Cappuccino ------> 1500 tg");
            System.out.println("0. Exit");
            ch1 = sc.nextInt();
            if(ch1 == 0) menu = false;
            else if (ch1 >= 1 && ch1 <= 4) {
                if(addonMenu(ch1)!=0){
                    menu = false;
                }
            }
            else{
                System.out.println("Choose correct option!");
            }
        }
    }
}