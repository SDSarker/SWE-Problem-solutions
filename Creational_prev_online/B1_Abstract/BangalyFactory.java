public class BangalyFactory extends MealFactory {
    @Override
    public String getStarter() {
        return "Vegetable";
    }

    @Override
    public String getMain() {
        return "Chicken Curry";
    }

    @Override
    public String getDessert() {
        return "Sweet Curd";
    }
}
