package entity;

import Moves.MoveHelper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class SpiritCreator {
    ArrayList<Spirit> arr = new ArrayList<>();
    JSONParser parser = new JSONParser();
    JSONArray pokemon = (JSONArray) parser.parse(new FileReader("src/Assists/Spirits.json"));

    String name;
    String nickName;
    int spiritId;
    String sprite;

    int baseHp;
    int baseAtk;
    int baseDef;
    int baseSpAtk;
    int baseSpDef;
    int baseSpeed;

    // change to SV
    int ivHp;
    int ivAtk;
    int ivDef;
    int ivSpAtk;
    int ivSpDef;
    int ivSpeed;

    // change to CV
    int evHp;
    int evAtk;
    int evDef;
    int evSpAtk;
    int evSpDef;
    int evSpeed;
    JSONArray s;

    int[] moveID = new int[4];

    MoveHelper a = new MoveHelper();

    Random r = new Random();

    public SpiritCreator(int Id) throws IOException, ParseException {
        createSpirit();
        //arr.get(Id);
        // uncomment for testing
        for (int i = 0; i < arr.size(); i++) {
            //System.out.println(arr.get(i));
            //System.out.println(i);

        }

    }

    // create an instance of a sprite from Spirits.json
    public void createSpirit() throws IOException, ParseException {
        for (Object o : pokemon) {
            JSONObject mon = (JSONObject) o;
            // Id not used yet
            spiritId = (int) (long) mon.get("spiritId");
            name = (String) mon.get("name");
            nickName = name;

            baseHp = (int) (long) mon.get("baseHp");
            baseAtk =  (int) (long) mon.get("baseAtk");
            baseDef =  (int) (long) mon.get("baseDef");
            baseSpAtk =  (int) (long) mon.get("baseSpAtk");
            baseSpDef = (int) (long) mon.get("baseSpDef");
            baseSpeed = (int) (long) mon.get("baseSpeed");

            s = (JSONArray) mon.get("move");

            for (int j = 0; j < s.size(); j++) {
                moveID[j] = (int)(long) s.get(j);
                //System.out.println(moveID[j]);
            }


            ivHp = r.nextInt(31);
            ivAtk = r.nextInt(31);
            ivDef = r.nextInt(31);
            ivSpAtk = r.nextInt(31);
            ivSpDef = r.nextInt(31);
            ivSpeed = r.nextInt(31);

            evHp = 0;
            evAtk = 0;
            evDef = 0;
            evSpAtk = 0;
            evSpDef = 0;
            evSpeed = 0;

            arr.add(new Spirit(name, nickName, spiritId, "", baseHp, baseAtk, baseDef, baseSpAtk, baseSpDef, baseSpeed,
                    ivHp, ivAtk, ivDef, ivSpAtk, ivSpDef, ivSpeed, evHp, evAtk, evDef, evSpAtk, evSpDef, evSpeed, a.getID(moveID[0])));

        }
    }


    @Override
    public String toString() {
        return "SpiritCreator{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", spiritId=" + spiritId +
                ", sprite='" + sprite + '\'' +
                ", baseHp=" + baseHp +
                ", baseAtk=" + baseAtk +
                ", baseDef=" + baseDef +
                ", baseSpAtk=" + baseSpAtk +
                ", baseSpDef=" + baseSpDef +
                ", baseSpeed=" + baseSpeed +
                ", ivHp=" + ivHp +
                ", ivAtk=" + ivAtk +
                ", ivDef=" + ivDef +
                ", ivSpAtk=" + ivSpAtk +
                ", ivSpDef=" + ivSpDef +
                ", ivSpeed=" + ivSpeed +
                ", evHp=" + evHp +
                ", evAtk=" + evAtk +
                ", evDef=" + evDef +
                ", evSpAtk=" + evSpAtk +
                ", evSpDef=" + evSpDef +
                ", evSpeed=" + evSpeed +
                ", a=" + a +
                '}';
    }
}
