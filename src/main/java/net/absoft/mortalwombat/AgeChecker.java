package net.absoft.mortalwombat;

public class AgeChecker {
    private final int min_age =21;
    public boolean canPlayGame(int age){
        return age >= min_age;
    }
}
