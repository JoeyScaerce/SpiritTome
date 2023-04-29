package entity;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Player extends Entity{

    public Player() throws IOException, ParseException {
        // this is currently broken
        party[0] = new SpiritCreator(100);

        System.out.println(party[0]);

    }
}
