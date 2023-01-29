package cydeo.farmer;

import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN)); //using lombok's @AllArgsConstructor
        inventory.add(new Apple(100, Color.RED)); //   -//-
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        ApplePredicate abc = new AppleHeavyPredicate(); //new object for heavy apple predicate
        List<Apple> heavyApple = filterApples(inventory, abc);
        System.out.println(heavyApple);


        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);

        //ApplePredicate weightApple = (Apple apple) -> apple.getWeight() > 200;

        //simplified:
        ApplePredicate weightApple = apple -> apple.getWeight() > 200;
        filterApples(inventory, weightApple);


        }
                               //parameters: [Inventory with 'List' type], [object = 'new' keyword]
        private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){ //apple predicate in the parameter is a poly: it will check the color for GREEN
                                                                                                       // and weight for over 200
            List<Apple> result = new ArrayList<>(); //create an empty bucket (new ArrayList) and based on the filter list, we will put all in here and return it

            for (Apple apple : inventory){ //"go to the inventory and get one apple
                if (applePredicate.test(apple)){ // to check (test predicate)
                    result.add(apple); //if 'true' add to the 'apple' bucket
                }
            }
            return result;
    }
}
