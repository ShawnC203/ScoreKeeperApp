package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int overwatchScore = 0;
    int talonScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayOverwatch( 0 );
    }

    /**
     * Displays the given score for Overwatch.
     */
    public void displayOverwatch(int score) {
        TextView scoreView = (TextView) findViewById(R.id.overwatch_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * these methods are referenced by 'android:onClick' buttons
     * references displayOverwatch method to show score
     */
    public void knockout( View view ) {
        overwatchScore = overwatchScore + 3;
        displayOverwatch( overwatchScore );

    }

    public void assist( View view ) {
        overwatchScore = overwatchScore + 2;
        displayOverwatch( overwatchScore );
    }

    public void breach( View view ) {
        talonScore = talonScore - 1;
        displayTalon( talonScore );

    }

    /**
     * methods for Talon's scores
     */

    public void knockoutTalon( View view ) {
        talonScore = talonScore + 3;
        displayTalon( talonScore );
    }

    public void assistTalon( View view ) {
        talonScore = talonScore + 2;
        displayTalon( talonScore );
    }

    public void breachTalon( View view ) {
        overwatchScore = overwatchScore - 1;
        displayOverwatch( overwatchScore );
    }

    public void resetScore( View v ) {
        overwatchScore = 0;
        talonScore = 0;
        displayOverwatch( overwatchScore );
        displayTalon( talonScore );
    }

    /**
     * Displays the given score for Talon.
     */
    public void displayTalon(int score) {
        TextView scoreView = (TextView) findViewById(R.id.talon_score);
        scoreView.setText(String.valueOf(score));
    }
}
