package HomeWork02.Animals.Groups;

import java.time.LocalDate;

import HomeWork02.Animals.Groups.Base.Animal;

public abstract class Pet extends Animal {
    protected String nickname;
    protected String breed;
    protected boolean hasVaccinations;
    protected String coatColor;
    protected LocalDate dateOfBirth;

    public abstract void showAffection();

    public Pet(int height, Double weight, String eyeColor, String nickname, String breed, boolean hasVaccinations,
            String coatColor) {
        super(height, weight, eyeColor);
        this.nickname = nickname;
        this.breed = breed;
        this.hasVaccinations = hasVaccinations;
        this.coatColor = coatColor;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("nickname %s, ", this.nickname));
        sb.append(String.format("breed %s, ", this.breed));
        sb.append(String.format("hasVaccinations %s, ", this.hasVaccinations ? "Yes" : "No"));
        sb.append(String.format("coatColor %s, ", this.coatColor));
        sb.append(super.getInfo());
        return sb.toString();
    }
}