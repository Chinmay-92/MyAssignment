package com.example.mobigictechnologies.myassignment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.mobigictechnologies.myassignment.dummy.DummyContent;

public class ExamActivity extends AppCompatActivity implements QuestionFragment.OnListFragmentInteractionListener {
    //private static final int CONTENT_VIEW_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        FrameLayout frame = new FrameLayout(this);
        frame.setId(android.R.id.content);
        setContentView(frame, new ActionBar.LayoutParams(
                ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT));

        if (savedInstanceState == null) {
            android.support.v4.app.Fragment newFragment = new QuestionFragment();
            //FragmentTransaction ft = getFragmentManager().beginTransaction();
            //ft.add(android.R.id.content, newFragment).commit();
            FragmentManager fragmentManager = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    fragmentManager.beginTransaction();
            android.support.v4.app.Fragment fragment=new QuestionFragment();
            fragmentTransaction.replace(android.R.id.content, fragment);
            fragmentTransaction.commit();
        }

    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {
        Toast.makeText(getApplicationContext(),"this is overriden BLANK method ExamActivity",Toast.LENGTH_LONG).show();
    }
}
