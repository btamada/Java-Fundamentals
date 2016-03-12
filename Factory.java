/**
 *  Example of implementing the Factory Design Pattern
 *
 *  - 3 Classes are created: Pizza, Cake and Burger
 *  - Each of the 3 classes implements the Food interface
 *  - When you create an instance of the FoodFactory class
 *
 */
public class Factory {

    interface Food {
        String getType();
    }

    static class Pizza implements Food {
        @Override
        public String getType() {
            return "Someone ordered a slice of pizza!";
        }
    }

    static class Cake implements Food {
        @Override
        public String getType() {
            return "Someone ordered a slice of cake!";
        }

    }
    static class Burger implements Food {
        @Override
        public String getType() {
            return "Someone order a burger combo!";
        }
    }

    static class FoodFactory {
        public Food getFood(String order) {

            order = order.toLowerCase();

            Food foodType = null;

            switch(order) {
                case "pizza":
                    foodType = new Pizza();
                    break;
                case "cake":
                    foodType = new Cake();
                    break;
                case "burger":
                    foodType = new Burger();
                    break;
                default:
                    throw new IllegalArgumentException("Sorry we don't serve that item...");
            }

            return foodType;
        }
    }

    public static void main(String[] args) {
        FoodFactory myFoodFactory = new FoodFactory();
        Food myPizza = myFoodFactory.getFood("pizza");
        Food myCake = myFoodFactory.getFood("cake");
        Food myBurger = myFoodFactory.getFood("burger");

        System.out.println(myPizza.getType());
        System.out.println(myCake.getType());
        System.out.println(myBurger.getType());
    }

}
