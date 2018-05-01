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
public class ActivityFragment extends Fragment {


    public ActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        final ArrayList<Outing> outings = new ArrayList<Outing>();
        outings.add(new Outing(R.string.activ_auto_name,
                R.string.activ_auto_text,
                R.string.activ_auto_web,
                R.string.activ_auto_place,
                R.drawable.activauto));
        outings.add(new Outing(R.string.act_grav_name,
                R.string.act_grav_text,
                R.string.act_grav_web,
                R.string.act_grav_place,
                R.drawable.actigravity));
        outings.add(new Outing(R.string.act_fami_name,
                R.string.act_fami_text,
                R.string.act_fami_web,
                R.string.act_fami_place,
                R.drawable.actifamily));
        outings.add(new Outing(R.string.acti_adrin_name,
                R.string.act_grav_text,
                R.string.act_grav_web,
                R.string.act_grav_place,
                R.drawable.actiadrinalin));
        outings.add(new Outing(R.string.acti_break_name,
                R.string.acti_break_text,
                R.string.acti_break_web,
                R.string.acti_break_place,
                R.drawable.acbrackout));

        OutingAdabter adapter = new OutingAdabter(getActivity(), outings, R.color.colorGray);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        ListView listView = (ListView) rootView.findViewById(R.id.list_guide);

        // Make the {@link ListView} use the {@link Adapter} we created above, so that the
        listView.setAdapter(adapter);

        return rootView;

    }

}