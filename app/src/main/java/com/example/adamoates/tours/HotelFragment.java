package com.example.adamoates.tours;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.adamoates.tours.R.layout.fragment_hotel;

/**
 * Created by adamoates on 7/7/17.
 */

public class HotelFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(fragment_hotel, container, false);
    }
}
