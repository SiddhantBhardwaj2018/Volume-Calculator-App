package com.siddhantbhardwaj.volumecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    ArrayList<Shape> shapeArrayList;

    MyCustomAdapter myCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        gridView = findViewById(R.id.gridView);

        Shape cube = new Shape(R.drawable.cube,"Cube");
        Shape cylinder = new Shape(R.drawable.cylinder,"Cylinder");
        Shape prism = new Shape(R.drawable.prism,"Prism");
        Shape sphere = new Shape(R.drawable.sphere,"Sphere");

        shapeArrayList = new ArrayList<>();
        shapeArrayList.add(cube);
        shapeArrayList.add(cylinder);
        shapeArrayList.add(prism);
        shapeArrayList.add(sphere);

        myCustomAdapter = new MyCustomAdapter(shapeArrayList,getApplicationContext());

        gridView.setAdapter(myCustomAdapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                String shape = shapeArrayList.get(position).getText();
                if(shape.equals("Sphere")){
                    intent = new Intent(getApplicationContext(), Sphere.class);
                    startActivity(intent);
                } else if (shape.equals("Prism")) {
                    intent = new Intent(getApplicationContext(), Prism.class);
                    startActivity(intent);
                } else if (shape.equals("Cube")) {
                    intent = new Intent(getApplicationContext(),Cube.class);
                    startActivity(intent);
                }else if(shape.equals("Cylinder")){
                    intent = new Intent(getApplicationContext(),Cylinder.class);
                    startActivity(intent);
                }
            }
        });

    }
}