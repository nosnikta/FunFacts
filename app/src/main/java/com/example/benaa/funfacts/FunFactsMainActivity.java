package com.example.benaa.funfacts;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.benaa.funfacts.FactBook;
import com.example.benaa.funfacts.R;

import java.util.Random;

public class FunFactsMainActivity extends AppCompatActivity {
    private FactBook factbook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private TextView factTextView;
    private Button showFactButton;
    private ConstraintLayout backgroundLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts_main);
        //Make sure the is an element with the id in the xml layout.
        factTextView = (TextView) findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.showFactButtton);
        backgroundLayout = findViewById(R.id.background);



        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String fact = factbook.getFact();

                factTextView.setText(fact);
                int color = colorWheel.getColor();
                backgroundLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };

        showFactButton.setOnClickListener(listener);


    }

}
