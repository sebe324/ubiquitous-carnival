package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonLike;
    Button buttonDelete;
    TextView likes;

    int likeAmount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLike =findViewById(R.id.buttonLike);
        buttonDelete = findViewById(R.id.buttonDelete);
        likes= findViewById(R.id.likes);

        buttonLike.setOnClickListener(view -> {
            likeAmount++;
            likes.setText(likeAmount + " polubień");
        });
        buttonDelete.setOnClickListener(view -> {
            if(likeAmount>0) {
                likeAmount--;
                likes.setText(likeAmount + " polubień");
            }
        });
    }
}