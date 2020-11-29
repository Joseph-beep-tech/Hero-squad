package Models;

import org.junit.Test;
import static org.junit.Assert.*;

public class SquadTest{
    Squad playSquad = new Squad ("Batman", "protect gotham", 4, 2);

    @Test
    public void getSquadName(){
        assertEquals("Batman", playSquad.getSquadName ());
    }

    @Test
    public void getSquadMission(){
        assertEquals("protect gotham", playSquad.getSquadMission ());
    }
}