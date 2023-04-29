package Moves;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MoveHelper {
    int ID;
    String name;
    int power;
    int points;
    String moveType;
    String description;

    public ArrayList<Moves> moveList = new ArrayList<>();
    JSONParser parser = new JSONParser();
    JSONArray move = (JSONArray) parser.parse(new FileReader("src/Assists/Moves.json"));

    public MoveHelper() throws IOException, ParseException {
        createMove();
        //System.out.println(moveList.get(0));

    }


    // add a moves from the Moves.json to an array list
    public void createMove(){
        for (Object o : move) {
            JSONObject mv = (JSONObject) o;

            //m.setID();
            //m.setName();
            //m.setPower();
            //m.setPoints();

            ID = (int) (long) mv.get("id");
            name = (String) mv.get("name");
            power = (int) (long) mv.get("power");
            points = (int) (long) mv.get("points");
            moveType = (String) mv.get("moveType");
            description = (String) mv.get("description");
            moveList.add(new Moves(ID, name, power, points, moveType, description));
            //System.out.println(moveList.size());
            //System.out.println(moveList.get(0));

        }
    }

    // testing stuff
    public Moves getID(int i) {
        //System.out.println(moveList.get(i-1));
        return moveList.get(i-1);
    }

    @Override
    public String toString() {
        return "MoveHelper{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", power=" + power +
                ", points=" + points +
                ", moveType='" + moveType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
