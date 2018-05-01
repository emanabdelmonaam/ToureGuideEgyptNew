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
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create a list of outing
        final ArrayList<Outing> outings = new ArrayList<Outing>();
        outings.add(new Outing(R.string.mallegypt_name,
                R.string.mallegypt_text,
                R.string.mallegypt_web,
                R.string.mallegypt_place,
                R.drawable.mallofegypt));
        outings.add(new Outing(R.string.mall_cairo_name,
                R.string.mall_cairo__text,
                R.string.mall_cairo__web,
                R.string.mall_cairo__place,
                R.drawable.mallcairof));
        outings.add(new Outing(R.string.mallpoin_name,
                R.string.mallpoin__text,
                R.string.mallpoin__web,
                R.string.mallpoin__place,
                R.drawable.mallpoint));

        OutingAdabter adapter = new OutingAdabter(getActivity(), outings, R.color.colorLiteBlou);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list_guide);

        // Make the {@link ListView} use the {@link Adapter} we created above, so that the
        // {@link ListView} will display list items for each {@link } in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}