package nyc.c4q.shannonalexander_navarro.housejson;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.shannonalexander_navarro.housejson.models.House;
import nyc.c4q.shannonalexander_navarro.housejson.network.RetrofitCall;

/**
 * Created by shannonalexander-navarro on 12/20/16.
 */

public class HouseFragment extends Fragment {

    List<House> houseList = new ArrayList<>();
    RecyclerView houseRV;
    HouseAdapter houseAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // RetrofitCall.getTheHouses();
    }

    @Override
    public void onStart() {
        super.onStart();
        RetrofitCall.getTheHouses();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.house_fragment, container, false);

        houseRV = (RecyclerView) root.findViewById(R.id.rv);
        houseRV.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        houseAdapter = new HouseAdapter(houseList);
        houseRV.setAdapter(houseAdapter);
        return root;
    }


}
