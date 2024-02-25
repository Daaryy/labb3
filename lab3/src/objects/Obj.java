package objects;


import exceptions.NameException;

import java.util.HashSet;
import java.util.Set;

public abstract class Obj {

     String name;
    private static Set<String> allName = new HashSet<>();

    public Obj (String name)  {

        if (allName.contains(name)) {
            throw new NameException ("Объект с именем" + name + " уже был создан");
        }
        else this.name = name;
        allName.add(name);
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }

}



