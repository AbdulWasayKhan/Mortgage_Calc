package com.awkhan94.mcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EntryForm extends AppCompatActivity {
    private static final String TAG = "DEBUG: EntryForm";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
        Log.d(TAG, "onCreate called");
    }

    /*this is the onclick method of the button*/
    public void buttonPaymentClicked(View v)
    {
        Log.d(TAG, "buttonPaymentClicked clicked");
        EditText iP = (EditText) findViewById(R.id.inputPrinciple);
        String inputPrinciple = iP.getText().toString();

        EditText iA = (EditText) findViewById(R.id.inputAmortization);
        String inputAmortization = iA.getText().toString();

        EditText iI = (EditText) findViewById(R.id.inputInterest);
        String inputInterest = iI.getText().toString();

        MortgageModel mortgageModel = new MortgageModel(inputPrinciple, inputAmortization, inputInterest);
        String answer = mortgageModel.computePayment();
        ((TextView)findViewById(R.id.labelAnswer)).setText(answer);

    }
}
