
package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void newSquad_instantiatesCorrectly_true() {
        Squad newSquad = Squad.setUpNewSquad();
        assertTrue(newSquad instanceof Squad);
    }

    @Test
    public void newSquad_getSize_Int() {
        Squad newSquad = Squad.setUpNewSquad();
        assertEquals(5,newSquad.getSize());
        }

    @Test
    public void newSquad_getInstances_true() {
        Squad newSquad = Squad.setUpNewSquad();
        Squad another = Squad.setUpNewSquad();
        assertTrue(Squad.getInstances().contains(newSquad));
        assertTrue(Squad.getInstances().contains(another));
    }

    @Test
    public void addMember_addsMemberToSquad_Hero(){
        Hero newHero = Hero.setUpNewHero();
    Squad testSquad = Squad.setUpNewSquad();
        Squad newSquad = Squad.findBySquadId(1);
        newSquad.clearAllSquadMembers();
        newSquad.getSquadMembers().add(newHero);
        newSquad.getSquadMembers().add(newHero);
        assertEquals(2,newSquad.getSquadMembers().size());
    }

    @Test
    public void setNewMember_hero(){
       Hero.clearAllHeroes();
       Hero newHero = Hero.setUpNewHero();
       Squad testSquad = Squad.setUpNewSquad();
        testSquad.setSquadMembers(newHero);
        assertEquals(1,testSquad.getSquadMembers().get(0).getId());
    }
}