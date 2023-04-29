package entity;

import Moves.MoveHelper;
import Moves.Moves;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Spirit {

    // if u want to test spirit without player, uncomment out the code bellow. not doing this will give you memory location

    /*String name;
    String nickName;
    int id;
    String sprite;

    Moves moves;

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
    int evSpeed*/;

    public Spirit(String name, String nickName, int id, String sprite, int baseHp, int baseAtk, int baseDef, int baseSpAtk, int baseSpDef, int baseSpeed,
                  int ivHp, int ivAtk, int ivDef, int ivSpAtk, int ivSpDef, int ivSpeed, int evHp, int evAtk, int evDef, int evSpAtk, int evSpDef, int evSpeed, Moves move /*place holder till my brain works with arrays again*/) throws IOException, ParseException {
        /*this.name = name;
        this.nickName = nickName;
        this.id = id;
        this.sprite = sprite;
        this.baseHp = baseHp;
        this.baseAtk = baseAtk;
        this.baseDef = baseDef;
        this.baseSpAtk = baseSpAtk;
        this.baseSpDef = baseSpDef;
        this.baseSpeed = baseSpeed;
        this.ivHp = ivHp;
        this.ivAtk = ivAtk;
        this.ivDef = ivDef;
        this.ivSpAtk = ivSpAtk;
        this.ivSpDef = ivSpDef;
        this.ivSpeed = ivSpeed;
        this.evHp = evHp;
        this.evAtk = evAtk;
        this.evDef = evDef;
        this.evSpAtk = evSpAtk;
        this.evSpDef = evSpDef;
        this.evSpeed = evSpeed;
        this.moves = move;*/
    }

    // placeholder for now
    /*@Override
    public String toString() {
        return "Spirit{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", id=" + id +
                ", sprite='" + sprite + '\'' +
                ",\n moves=" + moves + "\n" +
                ", baseHp=" + baseHp +
                ", baseAtk=" + baseAtk +
                ", baseDef=" + baseDef +
                ", baseSpAtk=" + baseSpAtk +
                ", baseSpDef=" + baseSpDef +
                ", baseSpeed=" + baseSpeed +
                ",\n ivHp=" + ivHp +
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
                '}';
    }*/
}
