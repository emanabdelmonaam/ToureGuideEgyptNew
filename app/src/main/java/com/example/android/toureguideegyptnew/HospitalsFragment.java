package com.example.android.toureguideegyptnew;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HospitalsFragment extends Fragment {

    public HospitalsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);


        final ArrayList<Outing> outings = new ArrayList<Outing>();
        outings.add(new Outing(R.string.hos_sau_name,
                R.string.hos_sau_text,
                R.string.hos_sau_web,
                R.string.hos_sau_place,
                R.drawable.hosalsoaudy));
        outings.add(new Outing(R.string.hos_air_name,
                R.string.hos_air_text,
                R.string.hos_dar_web,
                R.string.hos_air_place,
                R.drawable.hosalgawy));
        outings.add(new Outing(R.string.hos_dar_name,
                R.string.hos_dar_text,
                R.string.hos_dar_web,
                R.string.hos_dar_place,
                R.drawable.hosdarelfouad));

        OutingAdabter adapter = new OutingAdabter(getActivity(), outings, R.color.colorWaite);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        ListView listView = (ListView) rootView.findViewById(R.id.list_guide);

        // Make the {@link ListView} use the {@link Adapter} we created above, so that the
        listView.setAdapter(adapter);

        return rootView;

    }

}