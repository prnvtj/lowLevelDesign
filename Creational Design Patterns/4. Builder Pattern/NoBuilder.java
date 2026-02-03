
class BurgerMeal{
    //mandoatory params
    private String bun;
    private String patty;

    //optional params
    private String sides;
    private List<String> toppings;
    private boolean cheese;

    public BurgerMeal (String bun, String patty, String sides, List<String>toppings, boolean cheese){
        this.bun = bun;
        this.patty = patty;
        this.sides = sides;
        this.toppings = toppings;
        this.cheese = cheese;
    }
}

class NoBuilder{
    static void main() {
        BurgerMeal burgerMeal = new BurgerMeal ("wheat", "veg", null, null, false);
    }
}