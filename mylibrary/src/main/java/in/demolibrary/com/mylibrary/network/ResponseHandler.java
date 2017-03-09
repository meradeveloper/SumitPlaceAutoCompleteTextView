package in.demolibrary.com.mylibrary.network;

import in.demolibrary.com.mylibrary.json.JsonParsingException;

import java.io.InputStream;

interface ResponseHandler<T> {
    T handleStreamResult(InputStream is) throws JsonParsingException;
}
