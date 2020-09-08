package ir.wccs.mrsalamat;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TravelFragment extends Fragment {



    public static TravelFragment instance (){

        TravelFragment fragment = new TravelFragment();
        return fragment;
        

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_travel,container,false);
        initView(view);
        return view;

    }

    private void initView(View view){



    }
}
