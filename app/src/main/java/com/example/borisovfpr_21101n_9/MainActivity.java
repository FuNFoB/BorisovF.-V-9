package com.example.borisovfpr_21101n_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn;
DBHelper DB;
EditText ed1;
EditText ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button1);
        ed1=findViewById(R.id.ed1);
        ed1=findViewById(R.id.ed2);
        DB=new DBHelper(this);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //SQLiteDatabase database = DB.getWritableDatabase();
        //ContentValues conten = new ContentValues();
        //String log = ed1.getText().toString();
        //String pas = ed2.getText().toString();
        //if (ed1.length()>1 && ed2.length()>1) {
            //ADD
           // conten.put(DB.KEY_LOGIN, log);
            //conten.put(DB.KEY_PASSWORD, pas);
            //database.insert(DB.TableName, null, conten);
            Intent intenty = new Intent(this, personal_area.class);
            startActivity(intenty);
        }
    }
//}