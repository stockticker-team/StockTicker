package quiz.honeywell.com.stockticker.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import quiz.honeywell.com.stockticker.R;
import quiz.honeywell.com.stockticker.databinding.ActivityMainBinding;
import quiz.honeywell.com.stockticker.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel mainDO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainDO = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        mainDO = new MainActivityViewModel();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mainDO.populateData();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
