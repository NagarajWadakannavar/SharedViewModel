package com.nagaraj.sharedviewmodel;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class FragmentA extends Fragment implements View.OnClickListener {
    private TextInputEditText editText;
    private SharedViewModel viewModel;
    private ClickListener clickListener;

    public interface ClickListener {
        void addDetailFragment();
    }

    public FragmentA() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        clickListener = (ClickListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        view.findViewById(R.id.btn).setOnClickListener(this);
        editText = view.findViewById(R.id.edit_text);
        viewModel = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        editText.setText(viewModel.getData());
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                viewModel.setData(editText.getText().toString().trim());
                clickListener.addDetailFragment();
                break;

        }

    }
}
