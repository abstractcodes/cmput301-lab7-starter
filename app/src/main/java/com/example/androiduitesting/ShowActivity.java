package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        // Get the city name from the intent
        String cityName = getIntent().getStringExtra("city_name");
        TextView cityTextView = findViewById(R.id.text_city_name);
        cityTextView.setText(cityName);

        // Find the back button and set click listener
        Button backButton = findViewById(R.id.button_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // This closes the activity and goes back
            }
        });
    }
}
