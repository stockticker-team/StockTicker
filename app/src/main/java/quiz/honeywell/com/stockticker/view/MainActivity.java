package quiz.honeywell.com.stockticker.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

import quiz.honeywell.com.stockticker.R;
import quiz.honeywell.com.stockticker.adapters.CompanyListAdapter;
import quiz.honeywell.com.stockticker.databinding.ActivityMainBinding;
import quiz.honeywell.com.stockticker.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    RecyclerView rcvCompanyList;
    private MainActivityViewModel mainDO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainDO = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        mainDO = new MainActivityViewModel();

        ArrayList<String> searchArrayList= new ArrayList<String>();
        searchArrayList.add("Facebook");
        searchArrayList.add("Amazon");
        searchArrayList.add("MicroSoft");
        searchArrayList.add("HoneyWell");
        searchArrayList.add("Infosys");
        searchArrayList.add("Tata Services");
        searchArrayList.add("Qualcomm");
        AutoCompleteAdapter adapter = new AutoCompleteAdapter(this, android.R.layout.simple_dropdown_item_1line, android.R.id.text1, searchArrayList);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.search);
        autoCompleteTextView.setAdapter(adapter);

        rcvCompanyList = (RecyclerView) findViewById(R.id.recycler_view);
        CompanyListAdapter companyListAdapter = new CompanyListAdapter();
        rcvCompanyList.setLayoutManager(new LinearLayoutManager(this));
        rcvCompanyList.setAdapter(companyListAdapter);
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
