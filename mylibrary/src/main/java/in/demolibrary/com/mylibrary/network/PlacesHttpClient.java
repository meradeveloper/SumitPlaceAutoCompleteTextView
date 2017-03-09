package in.demolibrary.com.mylibrary.network;

import android.net.Uri;

import in.demolibrary.com.mylibrary.model.PlacesAutocompleteResponse;
import in.demolibrary.com.mylibrary.model.PlacesDetailsResponse;

import java.io.IOException;

public interface PlacesHttpClient {
    PlacesAutocompleteResponse executeAutocompleteRequest(Uri uri) throws IOException;

    PlacesDetailsResponse executeDetailsRequest(Uri uri) throws IOException;
}
