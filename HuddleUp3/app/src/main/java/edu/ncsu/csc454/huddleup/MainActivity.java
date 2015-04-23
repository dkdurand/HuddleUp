package edu.ncsu.csc454.huddleup;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import edu.ncsu.csc454.huddleup.fragments.AccountFragment;
import edu.ncsu.csc454.huddleup.fragments.HomeFragment;
import edu.ncsu.csc454.huddleup.fragments.InboxFragment;
import edu.ncsu.csc454.huddleup.fragments.MapFragment;
import edu.ncsu.csc454.huddleup.listeners.TabListener;


public class MainActivity extends Activity{

    ActionBar.Tab homeTab, mapTab, inboxTab, accountTab;

    // Fragments that will load when the tabs are clicked
    Fragment homeFragment = new HomeFragment();
    Fragment mapFragment = new MapFragment();
    Fragment inboxFragment = new InboxFragment();
    Fragment accountFragment = new AccountFragment();


    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getActionBar();

        // Set the current navigation mode to tabs
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Add titles to tabs
        homeTab = actionBar.newTab().setText("Home");
        mapTab = actionBar.newTab().setText("Map");
        inboxTab = actionBar.newTab().setText("Inbox");
        accountTab = actionBar.newTab().setText("Account");

        // Set tab listeners which provide callbacks for tab events
        // A callback informs another class when an action occurs
        homeTab.setTabListener(new TabListener(homeFragment));
        mapTab.setTabListener(new TabListener(mapFragment));
        inboxTab.setTabListener(new TabListener(inboxFragment));
        accountTab.setTabListener(new TabListener(accountFragment));

        // Adds tabs to the actionbar
        actionBar.addTab(homeTab);
        actionBar.addTab(mapTab);
        actionBar.addTab(inboxTab);
        actionBar.addTab(accountTab);
    }
}