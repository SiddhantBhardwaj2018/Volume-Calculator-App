package com.siddhantbhardwaj.volumecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cylinder extends AppCompatActivity {

    TextView cylinderTitle;
    EditText cylinderRadius;
    EditText cylinderHeight;
    TextView cylinderResult;
    Button cylinderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cylinder);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cylinderTitle = findViewById(R.id.cylinderTitle);
        cylinderRadius = findViewById(R.id.cylinderRadius);
        cylinderHeight = findViewById(R.id.cylinderHeight);
        cylinderResult = findViewById(R.id.cylinderResult);
        cylinderButton = findViewById(R.id.cylinderBtn);

        cylinderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = cylinderRadius.getText().toString();
                String height = cylinderHeight.getText().toString();
                int r = Integer.parseInt(radius);
                int h = Integer.parseInt(height);
                double volume = 3.141519 * r * r * h;
                cylinderResult.setText("V = " + volume + " metres cubed");
            }
        });

    }
}