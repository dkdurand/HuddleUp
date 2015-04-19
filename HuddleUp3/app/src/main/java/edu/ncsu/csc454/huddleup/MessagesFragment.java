package edu.ncsu.csc454.huddleup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MessagesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //set view template
        View rootView = inflater.inflate(R.layout.fragment_messages, container, false);

        //add action to circle "plus" button
        View addButton = rootView.findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNewMessage();
            }
        });

        return rootView;
    }

    public void addNewMessage() {

    }

}