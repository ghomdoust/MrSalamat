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

public class MedicalFragment extends Fragment {

    private TextView medical_1 ;
    private TextView medical_2 ;
    private TextView medical_3 ;
    private TextView medical_4 ;


    public static MedicalFragment instance (){

        MedicalFragment fragment = new MedicalFragment();
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)

    {
        View view = inflater.inflate(R.layout.fragment_medical,container,false);

        initView(view);

        return view;

    }

    private void initView(View view){

        medical_1 = view.findViewById(R.id.medical_1);
        medical_2 = view.findViewById(R.id.medical_2);
        medical_3 = view.findViewById(R.id.medical_3);
        medical_4 = view.findViewById(R.id.medical_4);

        medical_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent medical_1 = new Intent(getActivity(),medical_p1.class);
                startActivity(medical_1);

            }
        });

        medical_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent medical_2 = new Intent(getActivity(),medical_p2.class);
                startActivity(medical_2);

            }
        });

        medical_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent medical_3 = new Intent(getActivity(),medical_p3.class);
                startActivity(medical_3);

            }
        });

        medical_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent medical_4 = new Intent(getActivity(),medical_p4.class);
                startActivity(medical_4);

            }
        });

    }

}
