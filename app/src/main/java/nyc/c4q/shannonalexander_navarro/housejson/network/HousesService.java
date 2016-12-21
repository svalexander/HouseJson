package nyc.c4q.shannonalexander_navarro.housejson.network;

import nyc.c4q.shannonalexander_navarro.housejson.models.HouseResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by shannonalexander-navarro on 12/20/16.
 */

public interface HousesService {
    @GET("cgi-bin/class_12_20_2016.pl")
    Call<HouseResponse> getAllHouses();

}
