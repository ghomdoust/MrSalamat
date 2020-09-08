package ir.wccs.mrsalamat;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TourismFragment extends Fragment {


    public static TourismFragment instance (){

        TourismFragment fragment = new TourismFragment();
        return fragment;


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tourism,container,false);
        initView(view);
        return view;

    }

    private void initView(View view){



}
}