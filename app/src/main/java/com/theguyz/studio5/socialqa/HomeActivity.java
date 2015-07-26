package com.theguyz.studio5.socialqa;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.theguyz.studio5.socialqa.models.QuestionsModel;


public class HomeActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private View shadowView;
    FloatingActionButton fab;
    HomeActivityFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        shadowView = findViewById(R.id.toolbar_shadowview);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            shadowView.setVisibility(View.GONE);
            toolbar.setElevation(4);
        }
        fab = (FloatingActionButton)findViewById(R.id.fabBtn);
        fragment = (HomeActivityFragment)getSupportFragmentManager().findFragmentById(R.id.home_fragment);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO set the question type appropriately
                fragment.mResultList.add(new QuestionsModel(QuestionsModel.QuestionType.TWOIMAGEQUESTION));
                fragment.questionsAdapter.notifyItemInserted(fragment.mResultList.size());
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
