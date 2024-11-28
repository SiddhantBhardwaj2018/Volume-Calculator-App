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

public class Cube extends AppCompatActivity {

    TextView cubeTitle;
    EditText cubeSide;
    TextView cubeResult;
    Button cubeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cube);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cubeTitle = findViewById(R.id.cubeTitle);
        cubeSide = findViewById(R.id.cubeSide);
        cubeResult = findViewById(R.id.cubeResult);
        cubeButton = findViewById(R.id.cubeButton);

        cubeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String side = cubeSide.getText().toString();
                int sideLen = Integer.parseInt(side);
                double volume  = sideLen * sideLen * sideLen;
                cubeResult.setText("V = " + volume + " metres cubed");
            }
        });

    }
}