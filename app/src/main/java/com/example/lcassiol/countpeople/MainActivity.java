package com.example.lcassiol.countpeople;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numPessoas = 0;
    int numHomens = 0;
    int numMulheres = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView txtPessoas = (TextView) findViewById(R.id.txtPessoas);

        final Button btnHomem = (Button) findViewById(R.id.btnHomem);
        final Button btnMulher = (Button) findViewById(R.id.btnMulher);
        final Button btnReset = (Button) findViewById(R.id.btnReset);


        btnHomem.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                numPessoas++;
                numHomens++;
                txtPessoas.setText("Total Pessoas : " + Integer.toString(numPessoas));
                btnHomem.setText(Integer.toString(numHomens));
            }
        });

        btnMulher.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                numPessoas++;
                numMulheres++;
                txtPessoas.setText("Total Pessoas : " + Integer.toString(numPessoas));
                btnMulher.setText(Integer.toString(numMulheres));
            }
        });

        btnReset.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                numPessoas=0;
                numMulheres=0;
                numHomens=0;
                txtPessoas.setText("Total Pessoas : " + Integer.toString(numPessoas));
                btnMulher.setText(Integer.toString(numMulheres));
                btnHomem.setText(Integer.toString(numHomens));
            }
        });
    }

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
}
