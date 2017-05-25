package com.example.smartlibrarydemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickSearch (View view) {
        Button search_btn = (Button) findViewById(R.id.search_btn);
        Intent intent = new Intent(MainActivity.this, Search.class);
        startActivity(intent);
    }

    public void onClickScan (View view) {
        Button scan_btn = (Button) findViewById(R.id.scan_btn);
        Intent intent = new Intent(MainActivity.this, ScannerActivity.class);
        startActivity(intent);
    }

}

