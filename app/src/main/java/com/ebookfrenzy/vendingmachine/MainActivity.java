package com.ebookfrenzy.vendingmachine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView totalAmount;
    TextView totalQuanityAmount;

    Button mountainDewB;
    Button dietMountainDewB;
    Button pepsiB;
    Button dietPepsiB;
    Button rootBeerB;
    Button dietRootBeerB;


    SodaNames mountainDew;
    SodaNames dietMountainDew;
    SodaNames pepsi;
    SodaNames dietPepsi;
    SodaNames rootBeer;
    SodaNames dietRootBeer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initSodaNames();

        onClickListener();
        initScreenView();



    }



    public void initSodaNames()
    {
        mountainDew=new SodaNames("Mountain Dew");
        dietMountainDew= new SodaNames("Diet Mountain Dew");
        pepsi=new SodaNames("Pepsi");
        dietPepsi=new SodaNames("Diet Pepsi");
        rootBeer = new SodaNames("A&W Root Beer");
        dietRootBeer=new SodaNames("Diet A&W Root Beer");
    }

    public void onClickListener()
    {
        mountainDewB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {


            }
        });

        dietMountainDewB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });

        pepsiB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });

        dietPepsiB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });

        rootBeerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });

        dietRootBeerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });
    }


    public void initScreenView()
    {
        totalAmount = (TextView)findViewById(R.id.totalAmountTextView);
        totalQuanityAmount = (TextView)findViewById(R.id.quanityTextTextView);
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
        if (id == R.id.action_settings)
        {
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
