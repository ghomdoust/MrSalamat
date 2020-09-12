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

    private TextView tourism_1 ;
    private TextView tourism_2 ;
    private TextView tourism_3 ;
    private TextView tourism_4 ;
    private TextView tourism_5 ;

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

        tourism_1 = view.findViewById(R.id.tourism_1);
        tourism_2 = view.findViewById(R.id.tourism_2);
        tourism_3 = view.findViewById(R.id.tourism_3);
        tourism_4 = view.findViewById(R.id.tourism_4);
        tourism_5 = view.findViewById(R.id.tourism_5);

        tourism_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tourism_1 = new Intent(getActivity(),tourism_p1.class);
                startActivity(tourism_1);

            }
        });

        tourism_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tourism_2 = new Intent(getActivity(),tourism_p2.class);
                startActivity(tourism_2);

            }
        });

        tourism_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tourism_3 = new Intent(getActivity(),tourism_p3.class);
                startActivity(tourism_3);

            }
        });

        tourism_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tourism_4 = new Intent(getActivity(),tourism_p4.class);
                startActivity(tourism_4);

            }
        });
        tourism_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tourism_5 = new Intent(getActivity(),tourism_p5.class);
                startActivity(tourism_5);

            }
        });

}
}