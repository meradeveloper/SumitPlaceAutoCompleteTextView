package in.sumit.com.place.model;

import com.google.gson.annotations.SerializedName;

public enum PlaceType {
    @SerializedName("route")
    ROUTE,
    @SerializedName("geocode")
    GEOCODE
}
