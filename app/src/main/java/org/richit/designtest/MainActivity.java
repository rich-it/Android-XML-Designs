package org.richit.designtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textViewPerson;
    Button button;
    String nameArray [] = {"Shuvo, Masrur, Fayaz, Plabon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewPerson = findViewById(R.id.personviewtv);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i=nameArray.length-1)
                    i=0;
                textViewPerson.setText(nameArray[i++]);
            }
        });

    }
}
