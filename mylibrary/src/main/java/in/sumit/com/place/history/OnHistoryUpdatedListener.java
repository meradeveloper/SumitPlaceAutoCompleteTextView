package in.sumit.com.place.history;

import android.support.annotation.NonNull;

import in.sumit.com.place.model.Place;

import java.util.List;

public interface OnHistoryUpdatedListener {
    public void onHistoryUpdated(@NonNull List<Place> updatedHistory);
}
