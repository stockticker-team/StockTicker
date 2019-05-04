package quiz.honeywell.com.stockticker.viewmodel;

import android.arch.lifecycle.ViewModel;

import java.io.Serializable;

/**
 * Created by ADMIN on 5/4/2019.
 */

public class MainActivityViewModel extends ViewModel {

    private String compName = "";
    private String compLogo = "";
    private String StockAmt = "";

    public void setup(){
        populateData();
    }
    public void setCompName(String compName){
        this.compName = compName;
    }

    public String getCompName(){
        return this.compName;
    }

    public void setCompLogo(String compLogo){
        this.compLogo = compLogo;
    }

    public String getCompLogo(){
        return this.compLogo;
    }

    public void setStockAmt(String StockAmt){
        this.StockAmt = StockAmt;
    }

    public String getStockAmt(){
        return this.StockAmt;
    }

    //populate data
    public void populateData(){

    }
}
