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

public class Prism extends AppCompatActivity {

    TextView prismTitle;
    EditText prismBase;
    EditText prismHeight;

    TextView prismResult;

    Button prismBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prism);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        prismTitle = findViewById(R.id.prismTitle);
        prismBase =  findViewById(R.id.prismBase);
        prismHeight = findViewById(R.id.prismHeight);
        prismResult = findViewById(R.id.prismResult);
        prismBtn = findViewById(R.id.prismBtn);

        prismBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String base = prismBase.getText().toString();
                String height = prismHeight.getText().toString();
                int b = Integer.parseInt(base);
                int h = Integer.parseInt(height);
                double volume = 0.5 * b * h;
                prismResult.setText("V = " + volume + " metres cubed");
            }
        });

    }
}