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


    private TextView travel_1 ;
    private TextView travel_2 ;
    private TextView travel_3 ;
    private TextView travel_4 ;


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


        travel_1 = view.findViewById(R.id.travel_1);
        travel_2 = view.findViewById(R.id.travel_2);
        travel_3 = view.findViewById(R.id.travel_3);
        travel_4 = view.findViewById(R.id.travel_4);


        travel_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent travel_1 = new Intent(getActivity(),travel_p1.class);
                startActivity(travel_1);

            }
        });

        travel_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent travel_2 = new Intent(getActivity(),travel_p2.class);
                startActivity(travel_2);

            }
        });

        travel_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent travel_3 = new Intent(getActivity(),travel_p3.class);
                startActivity(travel_3);

            }
        });

        travel_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent travel_4 = new Intent(getActivity(),travel_p4.class);
                startActivity(travel_4);

            }
        });

    }
}
