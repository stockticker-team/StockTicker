package quiz.honeywell.com.stockticker.api;

import android.arch.lifecycle.LiveData;

import quiz.honeywell.com.stockticker.responsemodel.StockApiDataResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface StockApiEndPonits {

    @GET("function=SYMBOL_SEARCH&keywords={searchkey}&apikey={apikey}")
    LiveData<StockApiDataResponse> getStock (@Path("searchkey") String searchKey,@Path("apikey") int apiKey);



}
