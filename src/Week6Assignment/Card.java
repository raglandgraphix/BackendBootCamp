package Week6Assignment;

public class Card {
    // Fields
    private int value;
    private String name;
    //not calling a constructor because i wasn't directed to. When a variable is set as a default value of null or 0 it isn't require, however some say it is good practice.

    // Getters and Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to print out information about the card
    public void describe() {
        System.out.println("Card: " + this.name + " | Value: " + this.value);
    }
}