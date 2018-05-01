package com.example.android.toureguideegyptnew;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of outing
        final ArrayList<Outing> outings = new ArrayList<Outing>();
        outings.add(new Outing(R.string.Qahwa_name,
                R.string.Qahwa_text,
                R.string.Qahwa_web,
                R.string.Qahwa_place,
                R.drawable.reqahwa));
        outings.add(new Outing(R.string.Maharaja_name,
                R.string.Maharaja_text,
                R.string.Maharaja_web,
                R.string.Maharaja_place,
                R.drawable.resmahraga));
        outings.add(new Outing(R.string.Go_Crepe_name,
                R.string.Go_Crepe_text,
                R.string.Go_Crepe_web,
                R.string.Giza_pyramid_place,
                R.drawable.restagocrepe));
        outings.add(new Outing(R.string.left_bank_name,
                R.string.left_bank_text,
                R.string.left_bank_web,
                R.string.left_bank_place,
                R.drawable.leftbank));
        outings.add(new Outing(R.string.restelnail_name,
                R.string.restelnail_text,
                R.string.restelnail_web,
                R.string.restelnail_place,
                R.drawable.restarelnail));
        outings.add(new Outing(R.string.The_Namu_name,
                R.string.The_Namu_text,
                R.string.The_Namu_web,
                R.string.The_Namu_place,
                R.drawable.resamu));
        outings.add(new Outing(R.string.Zack_Chicken_name,
                R.string.Zack_Chicken_text,
                R.string.Zack_Chicken_web,
                R.string.Zack_Chicken_place,
                R.drawable.reszack));
        outings.add(new Outing(R.string.Zenzero_name,
                R.string.Zenzero_text,
                R.string.Zenzero_web,
                R.string.Zenzero_place,
                R.drawable.reszenzero));

        // Create an {@link Adapter}, whose data source is a list of {@link}s. The
        // adapter knows how to create list items for each item in the list.
        OutingAdabter adapter = new OutingAdabter(getActivity(), outings, R.color.colorDarkBlou);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list_guide);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}