public class Restaurant {
    private MealFactory f;
    public Restaurant(MealFactory f){
        this.f=f;
    }

    public Meal getmeal(){
        return new Meal(f.getStarter(), f.getMain(), f.getDessert());
    }
};
