package com.example.chatper1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class friends_list extends AppCompatActivity {

    private ListView listView;
    private String names[] = {
            "Rahul",
            "Girish",
            "Joseph",
            "Shreebuvan"
    };

    private String friend_status[] = {
            "Sleeping",
            "At College",
            "Good Morning",
            "Introverted"
    };


    private Integer imageid[] = {
            R.drawable.ic_person_black_24dp,
            R.drawable.ic_sentiment_satisfied_black_24dp,
            R.drawable.ic_sentiment_very_satisfied_black_24dp,
            R.drawable.ic_person_black_24dp
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_list);

        CustomList customList = new CustomList(this, names, friend_status, imageid);

        listView = findViewById(R.id.listView1);
        listView.setAdapter(customList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"You Clicked "+names[i],Toast.LENGTH_SHORT).show();
            }
        });
    }




/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    */
}
