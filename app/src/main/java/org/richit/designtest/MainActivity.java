package org.richit.designtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textViewPerson, textviewdmbnfvb;
    Button button;
    int colorArray[] = {
            R.color.salmon,
            R.color.deeppink,
            R.color.indigo,
            R.color.yellow
    };
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewPerson = findViewById(R.id.colorviewtv);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( i == colorArray.length-1)
                    i = 0;
                textViewPerson.setBackgroundColor(getResources().getColor(colorArray[i++]));
            }
        });

    }
}
