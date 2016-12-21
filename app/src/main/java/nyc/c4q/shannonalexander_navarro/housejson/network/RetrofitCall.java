package nyc.c4q.shannonalexander_navarro.housejson.network;

import android.util.Log;

import java.io.IOException;

import nyc.c4q.shannonalexander_navarro.housejson.models.House;
import nyc.c4q.shannonalexander_navarro.housejson.models.HouseResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shannonalexander-navarro on 12/20/16.
 */

public class RetrofitCall {

    private static final String HOUSE_URL = "http://jsjrobotics.nyc/";
    private static final String TAG = "success";
    // static List<HouseResponse> houseList = new ArrayList<>();
    static House house;
 //   List<House> houseList = new ArrayList<>();


    public static void getTheHouses() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HOUSE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        HousesService service = retrofit.create(HousesService.class);

        Call<HouseResponse> call = service.getAllHouses();

        call.enqueue(new Callback<HouseResponse>() {
            @Override
            public void onResponse(Call<HouseResponse> call, Response<HouseResponse> response) {


                // houseList = ourHouses;
                HouseResponse houseResponse = response.body();
//                List<House> ourHouse =  houseResponse.getHouseList();
//                ourHouse.add(houseResponse.getHouse());



                if (response.isSuccessful()) {
                    Log.d(TAG, "Success: " + houseResponse.getHouse());
                } else {
                    try {
                        Log.d(TAG, "Error" + response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<HouseResponse> call, Throwable t) {
                Log.e("FAILURE", "GOT NOTHING" + t);

            }

        });
    }

}
