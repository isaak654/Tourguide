package com.example.android.tourguide;


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
public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Create a list of locations with ArrayList
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.sight1), getString(R.string.sight1_address), getString(R.string.sight1_desc), R.drawable.duomo_messina));
        locations.add(new Location(getString(R.string.sight2), getString(R.string.sight2_address), getString(R.string.sight2_desc), R.drawable.zanca_palace));
        locations.add(new Location(getString(R.string.sight3), getString(R.string.sight3_address), getString(R.string.sight3_desc), R.drawable.neptune_fountain));
        locations.add(new Location(getString(R.string.sight4), getString(R.string.sight4_address), getString(R.string.sight4_desc), R.drawable.catalans_church));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}