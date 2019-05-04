package quiz.honeywell.com.stockticker.responsemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StockApiDataResponse {

    @SerializedName("bestMatches")
    @Expose
    private List<StockApiDataResponseList> bestMatches = null;

    public List<StockApiDataResponseList> getBestMatches() {
        return bestMatches;
    }

    public void setBestMatches(List<StockApiDataResponseList> bestMatches) {
        this.bestMatches = bestMatches;
    }

}
