package edu.ncsu.csc454.huddleup;

import android.content.Intent;
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

        //Open single message when clicking on names, date, or preview text of the first message in list
        View openMessageFrom = rootView.findViewById(R.id.from1);
        View openMessageDate = rootView.findViewById(R.id.date1);
        View openMessagePreview = rootView.findViewById(R.id.preview1);
        openMessageFrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMessage();
            }
        });
        openMessageDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMessage();
            }
        });
        openMessagePreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMessage();
            }
        });

        return rootView;
    }

    public void addNewMessage() {

    }

    public void openMessage() {
        Intent intent = new Intent(getActivity(),SingleMessageActivity.class);
        startActivity(intent);
    }


}