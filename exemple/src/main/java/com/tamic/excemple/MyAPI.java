package com.tamic.excemple;

import com.tamic.excemple.model.SouguBean;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by Tamic on 2016-07-07.
 */
public interface MyAPI {



    @Headers("Cache-Control : public, max-age = 3600")
    @GET("app.php")
    Observable<SouguBean> getSougu(@QueryMap Map<String, Object> maps);

    @Headers("Cache-Control : public, max-age = 3600")
    @GET("{url}")
    Observable<ResponseBody>getWeatherStr(@Path("url") String url,
                                        @QueryMap Map<String, String> maps);
}
