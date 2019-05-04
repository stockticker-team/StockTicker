package quiz.honeywell.com.stockticker.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

/**
 * Created by ADMIN on 5/4/2019.
 */



public class ViewModelProviderFactory extends ViewModelProvider.NewInstanceFactory {

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        if (modelClass.isAssignableFrom(MainActivityViewModel.class)) {
            return (T) new MainActivityViewModel();
        } else if(modelClass.isAssignableFrom(DetailsViewModel.class)){
            return (T) new DetailsViewModel();

        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
