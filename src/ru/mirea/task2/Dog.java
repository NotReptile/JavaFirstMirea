package ru.mirea.task2;

public class Dog {
    private String nickname;
    private int age;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int dogAgeToHumanAge(){
        return age * 7;
    }
    public String toString(){
        return "Dog name is " + nickname + "\nDog age = " + age;
    }
    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }
}
