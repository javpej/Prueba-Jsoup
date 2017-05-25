package com.example.javi.pruebajsoup;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ArrayList<Item> aItems;
    RecyclerView myrecyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.MainToolbar);
        setSupportActionBar(toolbar);
        myrecyclerview = (RecyclerView) findViewById(R.id.MyRecyclerView);
        RVAdapter adapter = new RVAdapter(aItems, this);
        myrecyclerview.setAdapter(adapter);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.add_action:

                Intent iadd = new Intent(this, AddActivity.class);

                startActivityForResult(iadd, 2);

                break;

            case R.id.abou_action:

                break;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == 2){


            String sUrl = data.getStringExtra("mensaje");



        }else if (resultCode == RESULT_CANCELED){

            return;

        }

    }

    public  class scrappingWeb extends AsyncTask<Void, Void, Void>{

        ProgressDialog pdialog;

        @Override
        protected Void doInBackground(Void... params) {



            return null;
        }
    }
}
