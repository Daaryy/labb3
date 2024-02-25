import exceptions.ConflictException;
import exceptions.DegreeException;
import objects.*;
import enums.Condition;
import enums.Gender;
import enums.Nationality;

public class Main {
    public static void main(String[] args) throws ConflictException, DegreeException {
        People jo = new People("Йохансен", Gender.MALE, Nationality.NORVEGIAN);
        People br = new People("Брайден", Gender.MALE, Nationality.UNKNOWN);
        Monster monster= new Monster("Существо");
        Ship ship= new Ship("Бдительная");
        Ship.Motor motor= new Ship.Motor();
        motor.start(jo);
        Ship.SteeringWheel steeringWheel = ship.new SteeringWheel();
        monster.feeling(Condition.HUNGRY);
        br.feeling(Condition.MADNESS);
        steeringWheel.turn (90, jo);
        ship.move(jo);
        br.feeling(Condition.FUN);
        jo.feeling(Condition.DESPAIR);
        jo.feeling(Condition.CONFUSION);
        jo.feeling(Condition.DETERMINATION);
        jo.feeling(Condition.TIRED);

        jo.conflict(monster);
        Water sea = new Water("Неизвестное море");
        Water waves = new Water("Волны") {
             public void swim() {
              System.out.println(  " колышутся");
           }
        };

            //People person1 = new People("a");
           // People person2 = new People("a");



            sea.storm(waves);
            monster.harassment();


    }
}
