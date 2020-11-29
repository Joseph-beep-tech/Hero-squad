package Models;

import java.util.ArrayList;
import java.util.List;

    public class Hero{
        private String heroesName;
        private String superPower;
        private String weakness;
        private int age;
        private int id;
        private int squadId;

        public Hero(String heroesName, int age, String superPower, String weakness, int squadId){
            this.heroesName = heroesName;
            this.age = age;
            this.superPower = superPower;
            this.weakness = weakness;
            this.squadId = squadId;
        }

        public void setId(int id){
            this.id = id;
        }

        public int getId(){
            return id;
        }

    }