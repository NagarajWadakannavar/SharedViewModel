package com.nagaraj.sharedviewmodel;


import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {


    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_b, container, false);
        TextView textView = view.findViewById(R.id.text);
        SharedViewModel viewModel = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        textView.setText(viewModel.getData());
        return view;
    }

}
