package sample;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Unit> units = new ArrayList<>();

    private List<Tower> defenceTowers = new ArrayList<>();

    public void addUnit(Unit unit){
        units.add(unit);
    }


    public List<Tower> getDefenceTowers() {
        return defenceTowers;
    }

    public void setDefenceTowers(List<Tower> defenceTowers) {
        this.defenceTowers = defenceTowers;
    }

    public List<Unit> getUnits() {
        return units;
    }
}
