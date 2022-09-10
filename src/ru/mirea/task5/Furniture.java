package ru.mirea.task5;

public abstract class Furniture {
    private String name;
    private String color;
    private String form;
    public abstract String use();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", form='" + form + '\'' +
                '}';
    }
}
