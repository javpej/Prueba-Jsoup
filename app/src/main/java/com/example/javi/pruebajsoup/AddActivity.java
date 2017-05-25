package com.example.javi.pruebajsoup;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Javi on 25/5/17.
 */

public class AddActivity extends AppCompatActivity {

    EditText etUrl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        etUrl = (EditText) findViewById(R.id.EtUrl);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_add, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.cancel_action:

                Intent icancel = getIntent();

                setResult(RESULT_CANCELED, icancel);

                finish();

                break;

        }

        return super.onOptionsItemSelected(item);
    }

    public void pulsarBotonAceptar (View v){

        String sMess = etUrl.getText().toString();

        Intent imess = getIntent();
        imess.putExtra("mensaje", sMess);
        setResult(2, imess);
        finish();

    }
}
