package com.example.borisovfpr_21101n_9;

import static android.graphics.Color.RED;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;

public class setting extends AppCompatActivity implements View.OnClickListener {
ImageView img1;
ImageButton img2;
CheckBox ch1;
    CheckBox ch2;
    CheckBox ch3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        img1=findViewById(R.id.imageView2);
        img1.setOnClickListener(this);
        img2=findViewById(R.id.imageButton);
        img2.setOnClickListener(this);
        ch1=findViewById(R.id.checkBox);
        ch2=findViewById(R.id.checkBox2);
        ch3=findViewById(R.id.checkBox3);
    }

    @Override
    public void onClick(View view) {
        if (ch1.isChecked() )
            { img1.setBackgroundColor(RED);  }

        else if (ch3.isChecked() )
        { ch2.setBackgroundColor(Color.GREEN);  }
        switch(view.getId()){
            case R.id.imageView2:
                Intent inty = new Intent(this,personal_area.class);
                startActivity(inty);
                break;
            case R.id.imageButton:
                Intent intew = new Intent(this,MainActivity.class);
                startActivity(intew);
                break;
        }

    }
}