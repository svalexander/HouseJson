package nyc.c4q.shannonalexander_navarro.housejson;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.shannonalexander_navarro.housejson.models.House;

/**
 * Created by shannonalexander-navarro on 12/20/16.
 */

public class HouseViewHolder extends RecyclerView.ViewHolder{

    private TextView location;
    private TextView price;
    private TextView style;

    public HouseViewHolder(View itemView) {
        super(itemView);

        location = (TextView) itemView.findViewById(R.id.locationTv);
        price = (TextView) itemView.findViewById(R.id.priceTv);
        style = (TextView) itemView.findViewById(R.id.styleTv);

    }

    public void bind(House house){
        location.setText(house.getLocation());
        price.setText(house.getPrice());
        style.setText(house.getStyle());
    }

}
