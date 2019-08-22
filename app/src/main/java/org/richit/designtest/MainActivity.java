package org.richit.designtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView ;
    Button buttonClick;

    String arr[] = {
      "12",
      "hip",
      "hop",
      "yo" ,
      "nice",
      "happy",
      "top",
      "keep",
      "dream",
      "loop",
    };


    int counter =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        buttonClick = findViewById(R.id.button);
        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter == arr.length-1)
                    counter = 0;

                textView.setText(arr[counter++]);

            }
        });
    }

}