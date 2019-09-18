package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView usernameTV = findViewById(R.id.editText1);
        final TextView emailTV = findViewById(R.id.editText2);
        final TextView passTV = findViewById(R.id.editText3);
        final TextView confirmPassTV = findViewById(R.id.editText4);

        Button button = findViewById(R.id.button);

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (usernameTV.getText().toString().equals("")){
                    Toast.makeText(FormActivity.this,"You must enter a username", Toast.LENGTH_LONG).show();
                }
                else if(emailTV.getText().toString().equals("")){
                    Toast.makeText(FormActivity.this,"You must enter an email", Toast.LENGTH_LONG).show();
                }
                else if(passTV.getText().toString().equals("")){
                    Toast.makeText(FormActivity.this,"You must enter a password", Toast.LENGTH_LONG).show();
                }
                else if(confirmPassTV.getText().toString().equals("")){
                    Toast.makeText(FormActivity.this,"You must confirm your password", Toast.LENGTH_LONG).show();
                }
                else if(!passTV.getText().toString().equals(confirmPassTV.getText().toString())){
                    Toast.makeText(FormActivity.this,"Your passwords must match", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(FormActivity.this,"Welcome " + usernameTV.getText().toString() + "!", Toast.LENGTH_LONG).show();
                }

            }
        };
        button.setOnClickListener(click);
    }
}

