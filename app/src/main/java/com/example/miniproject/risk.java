package com.example.miniproject;
import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class risk extends Fragment   {
EditText t1,t2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detectrisk, container, false);
        t1=view.findViewById(R.id.editTextTextPersonName3);
        t2=view.findViewById(R.id.editTextTextPersonName2);
        List<Integer> list = new ArrayList<>();
        // add 5 element in ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Random rand = new Random();
        int x = list.get(rand.nextInt(list.size()));
        t1.setText(String.valueOf(x));
        if(x<20){
            t2.setText("Safe");
        }
        if(x<30){
            t2.setText("Moderate");
        }
        if(x<40){
            t2.setText("Danger");
        }

        return view;
    }
   }