class BurgerMeal {
    private String bun;
    private String patty;

    //optional params
    private String sides;
    private List<String> toppings;
    private boolean cheese;

    private BurgerMeal (BurgerBuilder builder){
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.toppings = builder.toppings;
        this.sides = builder.sides;
    }

    private static class BurgerBuilder{

        private String bun;
        private String patty;

        //optional params
        private String sides;
        private List<String> toppings;
        private boolean cheese;

        public BurgerBuilder (String bun, String patty){
            this.bun = bun;
            this.patty = patty;
        }

        public BurgerBuilder addSides(String sides){
            this.sides = sides;
            return this
        }

        public BurgerBuilder addToppings(List<String>toppings){
            this.toppings = toppings;
            return this;
        }

        public BurgerBuilder addCheese(boolean cheese)
        {
            this.cheese = cheese;
            return this
        }

        public BurgerMeal build (){
            return new BurgerMeal(this);
        }
    }
}

class WithBuilder{
    static void main() {


        BurgerMeal plainBurger = new BurgerMeal.BurgerBuilder("Wheat", "chicken").build();
        BurgerMeal burgerWithSidesAndCheese = new BurgerMeal.BurgerBuilder("Wheat", "veg")
                .addSides("fries")
                .addCheese(true)
                .build();
    }
}