package net.absoft.mortalwombat;

public class AgeChecker {
    private final int min_age =18;
    public boolean canPlayGame(int age){
        return age >= min_age;
    }
}
