
abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}


class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return 0.89;
    }
}


class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return 1.99; 
    }
}


abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}


class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return 0.20 + beverage.cost(); // Milk price
    }
}

class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return 0.30 + beverage.cost(); // Soy price
    }
}


public class CoffeeShop {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend(); // Order a HouseBlend
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // Adding Milk to HouseBlend
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // Adding Soy to the beverage with Milk
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}