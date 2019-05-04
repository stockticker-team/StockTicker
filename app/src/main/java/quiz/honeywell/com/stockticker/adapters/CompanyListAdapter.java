package quiz.honeywell.com.stockticker.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import quiz.honeywell.com.stockticker.R;
import quiz.honeywell.com.stockticker.databinding.ActivityMainRecyclerItemBinding;
import quiz.honeywell.com.stockticker.responsemodel.StockApiDataResponse;

public class CompanyListAdapter extends RecyclerView.Adapter<CompanyListAdapter.MyViewHolder> {
    private ArrayList<StockApiDataResponse> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private final ActivityMainRecyclerItemBinding binding;
        // each data item is just a string in this case
        public MyViewHolder(ActivityMainRecyclerItemBinding v) {
            super(v.getRoot());
            this.binding = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public CompanyListAdapter() {
        mDataset = new ArrayList<>();
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CompanyListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        ActivityMainRecyclerItemBinding itemBinding =
                ActivityMainRecyclerItemBinding.inflate(layoutInflater, parent, false);
        return new MyViewHolder(itemBinding);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        StockApiDataResponse item = mDataset.get(position);
        holder.binding.setCompanyData(item.getBestMatches().get(0).get2Name());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public void addItem(StockApiDataResponse dataResponse) {
        if(dataResponse != null){
            mDataset.add(dataResponse);
            notifyDataSetChanged();
        }
    }
}