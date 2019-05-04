package quiz.honeywell.com.stockticker.api;

import android.arch.lifecycle.LiveData;

import quiz.honeywell.com.stockticker.responsemodel.StockApiDataResponse;
import quiz.honeywell.com.stockticker.responsemodel.StockDetailResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface StockApiEndPonits {

    @GET("function=SYMBOL_SEARCH&keywords={searchkey}&apikey={apikey}")
    LiveData<StockApiDataResponse> getStock (@Path("searchkey") String searchKey,@Path("apikey") String apiKey);

    @GET("function=TIME_SERIES_DAILY&symbol={stock_symbol}&apikey={api_key}")
    LiveData<StockDetailResponse> getStockDetail(@Path("stock_symbol") String symbol, @Path("api_key") String apiKey);

}
