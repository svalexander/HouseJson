package nyc.c4q.shannonalexander_navarro.housejson.models;

/**
 * Created by shannonalexander-navarro on 12/20/16.
 */
public class House {

    String style;
    int price;
    String location;
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
