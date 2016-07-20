package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by janerubygrissom on 7/20/16.
 */
public class AboutFragment extends Fragment {

                @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                View view = inflater.inflate(android.R.layout.simple_list_item_1,container,false);
                TextView tv = (TextView)view.findViewById(android.R.id.text1);
                tv.setText("If I wasn't Bob Dylan, I'd probably think that Bob Dylan has a lot of answers myself.");
                return view;
            }
    }
