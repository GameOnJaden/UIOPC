package com.firstapp.myapplication.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.firstapp.myapplication.AdminRegister;
import com.firstapp.myapplication.R;

public class AdminFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_admin,container,false);

        Button r_button = view.findViewById(R.id.sign_up);

        r_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent my_intent = new Intent(getActivity(), AdminRegister.class);
                startActivity(my_intent);

            }
        });

        return view;
    }
}
