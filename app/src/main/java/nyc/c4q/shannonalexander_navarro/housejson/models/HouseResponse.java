package nyc.c4q.shannonalexander_navarro.housejson.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shannonalexander-navarro on 12/20/16.
 */

public class HouseResponse {
    List<House> houseList = new ArrayList<>();

    private House house;

    public HouseResponse(House house) {
        this.house = house;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }



    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }
}
