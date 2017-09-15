package com.example.country;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button submit;
    public static final String EXTRA_MESSAGE = "You selected ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner cntn = (Spinner) findViewById(R.id.spinner);
                String message = cntn.getSelectedItem().toString();

                TextView txt = (TextView) findViewById(R.id.textView);
                txt.setText(message);
            }
        });
    }
}
