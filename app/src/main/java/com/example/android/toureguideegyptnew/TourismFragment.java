package com.example.android.toureguideegyptnew;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TourismFragment extends Fragment {

    public TourismFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of outing
        final ArrayList<Outing> outings = new ArrayList<Outing>();
        outings.add(new Outing(R.string.Egyptian_Museum_name,
                R.string.Egyptian_Museum_text,
                R.string.Egyptian_Museum_web,
                R.string.Egyptian_Museum_place,
                R.drawable.egyptianmuseum));
        outings.add(new Outing(R.string.Giza_pyramid_name,
                R.string.Giza_pyramid_text,
                R.string.Giza_pyramid_web,
                R.string.Giza_pyramid_place,
                R.drawable.pyramids));
        outings.add(new Outing(R.string.Sphinx_name,
                R.string.Sphinx_text,
                R.string.Sphinx_web,
                R.string.Sphinx_place,
                R.drawable.sphinx));
        outings.add(new Outing(R.string.Saqqara_name,
                R.string.Saqqara_text,
                R.string.Saqqara_web,
                R.string.Saqqara_place,
                R.drawable.saqqara));
        outings.add(new Outing(R.string.Citadel_of_Qaitbay_name,
                R.string.Citadel_of_Qaitbay_text,
                R.string.Citadel_of_Qaitbay_web,
                R.string.Citadel_of_Qaitbay_place,
                R.drawable.qaitbey));
        outings.add(new Outing(R.string.Sultan_Hassan_name,
                R.string.Sultan_Hassan_text,
                R.string.Sultan_Hassan_web,
                R.string.Sultan_Hassan_place,
                R.drawable.mosquesultanhassan));
        outings.add(new Outing(R.string.Church_name,
                R.string.Church_text,
                R.string.Church_web,
                R.string.Church_place,
                R.drawable.thehangingchurc));
        outings.add(new Outing(R.string.Cairo_Citadel_name,
                R.string.Cairo_Citadel_text,
                R.string.Cairo_Citadel_web,
                R.string.Cairo_Citadel_place,
                R.drawable.thumbnail));
        outings.add(new Outing(R.string.Khan_el_Khalili_name,
                R.string.Khan_el_Khalili_text,
                R.string.Khan_el_Khalili_web,
                R.string.Khan_el_Khalili_place,
                R.drawable.halili));
        outings.add(new Outing(R.string.Al_Azhar_Park_name,
                R.string.Al_Azhar_Park_text,
                R.string.Al_Azhar_Park_web,
                R.string.Al_Azhar_Park_place,
                R.drawable.azharpark));

        OutingAdabter adapter = new OutingAdabter(getActivity(), outings, R.color.colorBrawen);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        ListView listView = (ListView) rootView.findViewById(R.id.list_guide);

        // Make the {@link ListView} use the {@link Adapter} we created above, so that the
        // {@link ListView} will display list items for each {@link } in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}