package ru.mirea.task5;

public abstract class Dog {
    private String breedOfDog;
    private int height;

    public String getBreedOfDog() {
        return breedOfDog;
    }

    public void setBreedOfDog(String breedOfDog) {
        this.breedOfDog = breedOfDog;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return "Dog{" +
                "breedOfDog='" + breedOfDog + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
