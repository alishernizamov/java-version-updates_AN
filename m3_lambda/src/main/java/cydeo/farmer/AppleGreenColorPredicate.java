package cydeo.farmer;

public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN); //GREEN comes from Enum class
    }
}
