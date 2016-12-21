package nyc.c4q.shannonalexander_navarro.housejson;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.shannonalexander_navarro.housejson.models.House;

/**
 * Created by shannonalexander-navarro on 12/20/16.
 */

public class HouseAdapter extends RecyclerView.Adapter {
    List<House> houseList = new ArrayList<>();

    public HouseAdapter(List<House> houseList) {
        this.houseList = houseList;
    }

//    public HouseAdapter(List<HouseResponse> houseList) {
//        this.houseList = houseList;
//
//    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.house_item, parent, false);
        return new HouseViewHolder(itemView);    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        HouseViewHolder viewHolder = (HouseViewHolder) holder;

        House aHouse = houseList.get(position);
        viewHolder.bind(aHouse);

    }

    @Override
    public int getItemCount() {
        return houseList.size();
    }
}
