package edu.ncsu.csc454.huddleup.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import edu.ncsu.csc454.huddleup.R;
import edu.ncsu.csc454.huddleup.models.Contact;

public class EditContactActivity extends Activity {

    TextView nameTextView;
    TextView statusTextView;

    SeekBar shareSeekBar;
    TextView shareTextView;
    CheckBox shareCheckBox;

    CheckBox viewCheckBox;
    SeekBar viewSeekBar;
    TextView viewTextView;

    private List<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // initialize the items list
        contactList = new ArrayList<>();
        contactList.add(new Contact("Bob", "Walking around"));
        contactList.add(new Contact("John", "Walking around"));
        contactList.add(new Contact("Jerry", "Walking around"));
        contactList.add(new Contact("Joe", "Walking around", true, true, false));
        contactList.add(new Contact("Jenny", "Walking around"));
        contactList.add(new Contact("Mom", "Walking around", false, true, false));
        contactList.add(new Contact("Dad", "Walking around"));
        contactList.add(new Contact("Vin", "Walking around", true, false, true));
        contactList.add(new Contact("Sam", "Walking around"));

        setContentView(R.layout.activity_edit_contact);
        shareListener();
        viewListener();
        nameTextView = (TextView) findViewById(R.id.name);
        nameTextView.setText(contactList.get(1).name);

        statusTextView = (TextView) findViewById(R.id.status);
        statusTextView.setText(contactList.get(1).status);

        nameTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String temp = contactList.get(1).name;
                contactList.get(1).name = v.getText().toString();
                String after = contactList.get(1).name;
                statusTextView.setText(temp + " vs " + after);
                return true;
            }
        });
    }

    private void shareListener() {
        shareCheckBox = (CheckBox) findViewById(R.id.shareTimeCheckBox);
        shareSeekBar = (SeekBar) findViewById(R.id.shareTimeSeekBar);
        shareTextView = (TextView) findViewById(R.id.shareTimeTextView);

        // Initialize with '0'.
        shareTextView.setText("Share Time: " + shareSeekBar.getProgress() + "hrs");

        shareSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress = progressValue;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                shareCheckBox.setChecked(false);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                shareTextView.setText("Share Time: " + progress + "hrs");
            }
        });
    }

    private void viewListener() {
        viewCheckBox = (CheckBox) findViewById(R.id.viewTimeCheckBox);
        viewSeekBar = (SeekBar) findViewById(R.id.viewTimeSeekBar);
        viewTextView = (TextView) findViewById(R.id.viewTimeTextView);

        // Initialize with '0'.
        viewTextView.setText("View Time: " + viewSeekBar.getProgress() + "hrs");

        viewSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress = progressValue;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                viewCheckBox.setChecked(false);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                viewTextView.setText("View Time: " + progress + "hrs");
            }
        });
    }
}