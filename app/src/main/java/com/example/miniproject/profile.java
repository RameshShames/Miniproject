package com.example.miniproject;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;


public class profile extends Fragment {
    Global o=Global.getInstance();
    String name=o.getName();
    String email=o.getEmail();
   static EditText na,em,co;
   static ImageView pro;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile, container, false);
     na=view.findViewById(R.id.editTextTextPersonName);
        em=view.findViewById(R.id.editTextTextPersonName4);
        co=view.findViewById(R.id.editTextTextPersonName5);
        pro=view.findViewById(R.id.imageView);
        na.setText(name);
        em.setText(email);
        co.setText("Negative");
        return view;
    }

}