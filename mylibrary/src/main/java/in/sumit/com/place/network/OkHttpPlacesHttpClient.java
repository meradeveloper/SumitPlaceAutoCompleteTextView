package in.sumit.com.place.network;

import android.net.Uri;

import in.sumit.com.place.json.PlacesApiJsonParser;
import in.sumit.com.place.model.PlacesApiException;
import in.sumit.com.place.model.PlacesApiResponse;
import in.sumit.com.place.model.Status;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

class OkHttpPlacesHttpClient extends AbstractPlacesHttpClient {
    private final OkHttpClient okHttpClient;

    OkHttpPlacesHttpClient(PlacesApiJsonParser parser) {
        super(parser);
        okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(15L, TimeUnit.SECONDS);
        okHttpClient.setReadTimeout(15L, TimeUnit.SECONDS);
        okHttpClient.setWriteTimeout(15L, TimeUnit.SECONDS);
    }

    @Override
    protected <T extends PlacesApiResponse> T executeNetworkRequest(final Uri uri, final ResponseHandler<T> responseHandler) throws IOException {
        final Request request = new Request.Builder()
                .url(uri.toString())
                .build();

        Response response = okHttpClient.newCall(request).execute();

        T body = responseHandler.handleStreamResult(response.body().byteStream());

        Status status = body.status;

        if (status != null && !status.isSuccessful()) {
            String err = body.error_message;
            throw new PlacesApiException(err != null ? err : "Unknown Places Api Error");
        } else {
            return body;
        }
    }
}
