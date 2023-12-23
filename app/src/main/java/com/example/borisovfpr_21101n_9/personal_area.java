package com.example.borisovfpr_21101n_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class personal_area extends AppCompatActivity implements View.OnClickListener {
Button btn;
ImageButton imbtn1;
ImageButton imbtn2;
TextView txt;
DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_area);
        btn=findViewById(R.id.button2);

        imbtn1=findViewById(R.id.imageButton2);
        btn.setOnClickListener(this);
        imbtn1.setOnClickListener(this);
        imbtn2=findViewById(R.id.imageButton3);
        txt=findViewById(R.id.textView2);
        //DB = new DBHelper(this);
        //SQLiteDatabase database = DB.getWritableDatabase();
        //Cursor cursor = database.query(DB.TableName, null, null, null, null, null, null);

        //if (cursor.moveToLast()) {
          //  String name = cursor.getString(Integer.parseInt(DB.KEY_LOGIN));
      //      txt.setText("Привет, "+name+"!");
      //      cursor.close();
      //  }
        imbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(personal_area.this, setting.class);
                startActivity(intent2);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button2:
                //Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
                break;
            case R.id.imageButton2:
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;
        }
    }
}