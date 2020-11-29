package Models;

import org.junit.Test;
import static org.junit.Assert.*;

public class HeroTest{
    Hero one = new Hero ("superman", 30, "x-ray vision", "kryptonite", 3);

    @Test
    public void getHeroesName(){
        assertEquals ("superman", one.getHeroesName());
    }

    @Test
    public void setAge(){
        assertEquals (30, one.getAge ());
    }

    @Test
    public void getSuperPower(){
        assertEquals ("x-ray vision", one.getSuperPower ());
    }

    @Test
    public void getWeakness(){
        assertEquals ("kryptonite", one.getWeakness ());
    }

    @Test
    public void getSquadId(){
        assertEquals (3, one.getSquadId ());
    }
}