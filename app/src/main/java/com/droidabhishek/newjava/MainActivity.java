package com.droidabhishek.newjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int numberOfCoffee=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view){
        numberOfCoffee=++numberOfCoffee;
        display(numberOfCoffee);
    }


    public void decrement(View view){
        numberOfCoffee=--numberOfCoffee;
        display(numberOfCoffee);
    }


    /** This method is called when order button is clicked */
    public void SubmitOrder(View view) {
        /**Now I am adding an Int for the variable*/

        /**To increase the price as per quantity*/
        displayPrice(numberOfCoffee * 5);
    }

    /** This method displays the given quantity on the screen*/
    private void display(int number) {
        TextView quantityTextView=(TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }

    /**This method displays given price on the screen*/
    private void displayPrice(int number){
        TextView PriceTextView=(TextView) findViewById(R.id.price_text_view);
        PriceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
