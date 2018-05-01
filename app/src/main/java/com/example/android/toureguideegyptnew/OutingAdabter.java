package com.example.android.toureguideegyptnew;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class OutingAdabter extends ArrayAdapter<Outing> {

    private int mColorResourceId;

    /**
     * Create a new {@link OutingAdabter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param outings is the list of {@link Outing}s to be displayed.
     */
    public OutingAdabter(Context context, ArrayList<Outing> outings,  int vColorResourceId) {
        super(context, 0, outings);

        mColorResourceId= vColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Outing} object located at this position in the list
        Outing currentOuting = getItem(position);

        // Find the TextView in the list_item.xml layout with the Id.
        TextView descriptionName = (TextView) listItemView.findViewById(R.id.text_guide);
             descriptionName.setText(currentOuting.getmOutingName());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageViewOuting = (ImageView) listItemView.findViewById(R.id.image_outing);
             imageViewOuting.setImageResource(currentOuting.getmOutingImage());

         TextView descriptionText = (TextView) listItemView.findViewById(R.id.text_discreption_guid);
             descriptionText.setText(currentOuting.getmOutingText());

         TextView descriptionPhone = (TextView) listItemView.findViewById(R.id.phone_number);
              descriptionPhone.setText(currentOuting.getmOutingPlace());

         TextView descriptionWebSite = (TextView) listItemView.findViewById(R.id.website_outing);
              descriptionWebSite.setText(currentOuting.getmOutingWeb());

        // Set the theme color for the list item
          View changeColor = listItemView.findViewById(R.id.layout_background);

         // Find the color that the resource ID maps to
           int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
           changeColor.setBackgroundColor(color);

         return listItemView;
    }
}