package objects;

import exceptions.DegreeException;
import interfaces.Conflict;

public class Ship extends NotLive implements Conflict {
    private final String name;

    public Ship(String name) {
        super(name);
        this.name = name;
    }

    public void move(People people) {
        System.out.println( this.name + " плывет под управлением " + people.name);

    }
    public static class Motor{
        public void start(People people){
            System.out.println(people.name + " запустил мотор");
        };
    }

    class Deck {
    }

    class Bridge {
    }

    class Feed {
    }

    class Bow {
    }

    class Bowsprit {
    }

    class Сabin {
    }

    public class SteeringWheel {
        public int degree;
        public SteeringWheel () {
            this.degree=0;

        }

        public void turn(int degrees, People people) throws DegreeException {
            int turnDegree= degree+ degrees;
            if (degrees < 0 ) {
                throw new DegreeException("Штурвал нельзя так повернуть");
            }
            else if
            (degrees > 360 ) {
                throw new DegreeException("Штурвал нельзя так повернуть");
            }
            else

            System.out.println(people.name + " повернул штурвал на  " + degrees + " градусов");
            }

        }


    @Override
    public void conflict(Obj object) {

    }
}