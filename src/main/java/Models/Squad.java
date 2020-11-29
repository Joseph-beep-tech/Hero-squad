package Models;

public class Squad{
    private String squadName;
    private String squadMission;
    private  int SquadVolume;
    private int id;

    public Squad(String squadName, String squadMission, int squadVolume, int id){
        this.squadName = squadName;
        this.squadMission = squadMission;
        this.SquadVolume = squadVolume;
        this.id = id;
    }

    public void setSquadName(String squadName){
        this.squadName = squadName;
    }

    public void setSquadMission(String squadMission){
        this.squadMission = squadMission;
    }

    public void setSquadVolume(int squadVolume){
        this.SquadVolume = squadVolume;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getSquadName(){
        return squadName;
    }

    public String getSquadMission(){
        return squadMission;
    }

    public int getSquadVolume(){
        return SquadVolume;
    }

    public int getId(){
        return id;
    }
}
