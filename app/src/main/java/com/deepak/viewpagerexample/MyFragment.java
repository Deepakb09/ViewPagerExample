package com.deepak.viewpagerexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {
    int[] images = {R.drawable.desert, R.drawable.hydrangeas};

    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView1);

        Bundle bundle = getArguments();
        int pos = bundle.getInt("imagepos");
        imageView.setImageResource(images[pos]);

        return view;
    }

}
