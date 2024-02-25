package objects;

import exceptions.ConflictException;
import interfaces.Conflict;
import interfaces.Die;

public class Monster extends Live {
    public Monster(String name) {
        super(name);
    }

    @Override
    public void conflict(Object object) throws ConflictException {

    }


    public void die() {
        System.out.println("");
    }

    public void harassment() {
        System.out.println(name + " преследует");
    }


}
