package in.demolibrary.com.mylibrary.history;

import android.support.annotation.NonNull;

import in.demolibrary.com.mylibrary.model.Place;

import java.util.List;

public interface OnHistoryUpdatedListener {
    public void onHistoryUpdated(@NonNull List<Place> updatedHistory);
}
