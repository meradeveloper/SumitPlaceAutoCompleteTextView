package in.sumit.com.place.network;

import android.net.Uri;

import in.sumit.com.place.model.PlacesAutocompleteResponse;
import in.sumit.com.place.model.PlacesDetailsResponse;

import java.io.IOException;

public interface PlacesHttpClient {
    PlacesAutocompleteResponse executeAutocompleteRequest(Uri uri) throws IOException;

    PlacesDetailsResponse executeDetailsRequest(Uri uri) throws IOException;
}
