package cydeo.farmer;

public class AppleHeavyPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200; //using the @Getter to pull the weight
    }
}
