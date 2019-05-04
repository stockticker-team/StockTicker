package quiz.honeywell.com.stockticker.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import quiz.honeywell.com.stockticker.R;

public class DeatilsActivity extends AppCompatActivity {

    private TextView tvName,tvValue,tvValue1,tvValue2,tvType,tvClose,tvSymbol,tvRangeVal,tvOpenVal,tvMarketVal,tvPrevVal,tvRatioVal;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatils);

        tvName = findViewById(R.id.tvName);
        tvValue = findViewById(R.id.tvValue);
        tvValue1 = findViewById(R.id.tvValue1);
        tvValue2 = findViewById(R.id.tvValue2);
        tvType = findViewById(R.id.tvType);
        tvClose = findViewById(R.id.tvClose);
        tvSymbol = findViewById(R.id.tvSymbol);
        tvRangeVal = findViewById(R.id.tvRangeVal);
        tvOpenVal = findViewById(R.id.tvOpenVal);
        tvMarketVal = findViewById(R.id.tvMarketVal);
        tvPrevVal = findViewById(R.id.tvPrevVal);
        tvRatioVal = findViewById(R.id.tvRatioVal);
    }
}
