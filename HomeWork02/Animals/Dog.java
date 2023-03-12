package HomeWork02.Animals;

import HomeWork02.Animals.Groups.Pet;

public class Dog extends Pet{
    private boolean hasTraining;
    

    public Dog(int height, Double weight, String eyeColor, String nickname, String breed, boolean hasVaccinations,
            String coatColor, boolean hasTraining) {
        super(height, weight, eyeColor, nickname, breed, hasVaccinations, coatColor);
        this.hasTraining = hasTraining;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Class %s, ", this.getClass().getSimpleName()));
        sb.append(String.format("hasTraining %s, ", this.hasTraining ? "Yes" : "No"));
        sb.append(super.getInfo());
        return sb.toString();
    }

    public void makeSound() {
        System.out.println("Гав! ");      
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public void showAffection() {
        System.out.println("Тяф, тяф. Лащусь.");        
    }

    public boolean isHasTraining() {
        return hasTraining;
    }
    
    public void train (){
        this.hasTraining = true;
    }
    
}
