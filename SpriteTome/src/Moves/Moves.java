package Moves;

public class Moves {

    int ID;
    String name;
    int power;
    int points;
    String moveType;
    String description;

    // constructor method for movehelper
    //public Moves(int ID, String name, int power, int points, String moveType, String description) {}



    // this is for testing
    public Moves(int ID, String name, int power, int points, String moveType, String description) {
        this.ID = ID;
        this.name = name;
        this.power = power;
        this.points = points;
        this.moveType = moveType;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Moves{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", power=" + power +
                ", points=" + points +
                ", moveType='" + moveType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
