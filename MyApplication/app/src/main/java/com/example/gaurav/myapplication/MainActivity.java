package com.example.gaurav.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button click_me = (Button) (findViewById(R.id.click));
        Button close_app = (Button) (findViewById(R.id.exit));
        final TextView my_text = (TextView) (findViewById(R.id.text));

        /* On clicking Click Me */
        click_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand_color = new Random();
                my_text.setTextColor(rand_color.nextInt());
                //my_text.setText(rand_color.toString());
            }
        });

        /* On clicking Close App */
        close_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDestroy();
                System.exit(0);
            }
        });
    }
}
