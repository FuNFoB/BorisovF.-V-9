package com.example.borisovfpr_21101n_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn.findViewById(R.id.button1);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent inten = new Intent(this, personal_area.class);
        startActivity(inten);
    }
}