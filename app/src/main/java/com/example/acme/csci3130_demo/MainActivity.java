

package com.example.acme.csci3130_demo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;





public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.acme.csci3130.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submitbotton = (Button) findViewById(R.id.button2);

        submitbotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textOut = (TextView) findViewById(R.id.textView3);
                EditText textIn = (EditText) findViewById(R.id.editText2);


                textOut.setText(textIn.getText());
            }
        });
    }


}
