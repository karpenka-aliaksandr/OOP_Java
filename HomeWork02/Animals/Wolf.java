package HomeWork02.Animals;

import java.time.LocalDate;

import HomeWork02.Animals.Groups.WildAnimal;

public class Wolf extends WildAnimal {
    boolean leaderOfPack;

    public Wolf(int height, Double weight, String eyeColor, String habitat, LocalDate dateOfFound,
            boolean leaderOfPack) {
        super(height, weight, eyeColor, habitat, dateOfFound);
        this.leaderOfPack = leaderOfPack;
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Class %s, ", this.getClass().getSimpleName()));
        sb.append(String.format("leaderOfPack %s, ", this.leaderOfPack ? "Yes" : "No"));
        sb.append(super.getInfo());
        return sb.toString();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    @Override
    public void makeSound() {
        System.out.println("А-у-у-у-у-у!");
    }
    
    public boolean isLeaderOfPack() {
        return leaderOfPack;
    }
}
