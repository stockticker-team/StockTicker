package quiz.honeywell.com.stockticker.api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import quiz.honeywell.com.stockticker.BuildConfig;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StockServiceApi {

    private static StockServiceApi instance = null;

    private StockServiceApi(){
        getRetrofit();
    }

    public static StockServiceApi getInstance(){
        if(instance == null){
            instance = new StockServiceApi();

        }
        return instance;
    }

    public Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .client(new OkHttpClient.Builder()
                        .readTimeout(30, TimeUnit.SECONDS)
                        .writeTimeout(30, TimeUnit.SECONDS)
                        .build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }



    public StockApiEndPonits getUserService(){
        return getRetrofit().create(StockApiEndPonits.class);
    }


}
