package quiz.honeywell.com.stockticker.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

import quiz.honeywell.com.stockticker.R;
import quiz.honeywell.com.stockticker.databinding.ActivityMainBinding;
import quiz.honeywell.com.stockticker.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    private MainActivityViewModel mainDO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ArrayList<String> searchArrayList= new ArrayList<String>();

        searchArrayList.add("Facebook");
        searchArrayList.add("Amazon");
        searchArrayList.add("MicroSoft");
        searchArrayList.add("HoneyWell");
        searchArrayList.add("Infosys");
        searchArrayList.add("Tata Services");
        searchArrayList.add("Qualcomm");
//initilaze this array with your data
        AutoCompleteAdapter adapter = new AutoCompleteAdapter(this, android.R.layout.simple_dropdown_item_1line, android.R.id.text1, searchArrayList);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.search);
        autoCompleteTextView.setAdapter(adapter);


        mainDO = ViewModelProviders.of(this).get(MainActivityViewModel.class);
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

    private View bind(){
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainDO = new MainActivityViewModel();
        binding.setMainactivityviewmodel(mainDO);
        return binding.getRoot();

    }
}
