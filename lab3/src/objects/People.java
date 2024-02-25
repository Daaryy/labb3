package objects;

import enums.Gender;
import enums.Nationality;
import exceptions.ConflictException;
import exceptions.NameException;
import interfaces.Conflict;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class People extends Live implements  Conflict {
    String name;
    private Gender gender;
    private Nationality nationality;

    public People(String name, Gender gender, Nationality nationality) {
        super(name);
        this.name= name;
        this.gender = gender;
        this.nationality = nationality;
    }



    public Nationality getNationality() {
        return nationality;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }




    public void conflict(Live object) throws ConflictException {
        if (this.equals(object)) {
            throw new ConflictException("Объект не может конфликтовать сам собой");
        }
        System.out.println(name + " конфликт произошел c " + object.name);


    }


    @Override
    public void conflict(Object object) throws ConflictException {

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Live live = (Live) o;
        return Objects.equals(name.toLowerCase(), live.name.toLowerCase());
    }

    @Override
    public void conflict(Obj obj) throws ConflictException {

    }

    private static Set<String> allName = new HashSet<>();

    public People (String name)  {
        super(name);
        this.gender=null;
        this.nationality=null;


        if (allName.contains(name)) {
            throw new NameException("Объект с именем" + name + " уже был создан");
        }
        else this.name = name;
        allName.add(name);
    }

    // @Override
        // public void die() {
        //    System.out.println("f");

        // }


//}
    }
    class Hands{
    public int kolv;
    public Hands (int kolv) {
        this.kolv=kolv;

    }
    }

