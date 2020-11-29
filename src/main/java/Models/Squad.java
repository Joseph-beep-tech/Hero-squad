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
}
