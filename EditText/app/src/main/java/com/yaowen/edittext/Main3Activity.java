package com.yaowen.edittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText1,editText2,editText3,editText4,editText5;
    private Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editText1= (EditText) findViewById(R.id.et1_3);
        editText2= (EditText) findViewById(R.id.et2_3);
        editText3= (EditText) findViewById(R.id.et3_3);
        editText4= (EditText) findViewById(R.id.et4_3);
        editText5= (EditText) findViewById(R.id.et5_3);
        button1= (Button) findViewById(R.id.btn1_3);
        button2= (Button) findViewById(R.id.btn2_3);
        button3= (Button) findViewById(R.id.btn3_3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1_3:{
                String str=editText1.getText().toString();
                Toast.makeText(Main3Activity.this,str,Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.btn2_3:{
                String str=editText2.getText().toString();
                Toast.makeText(Main3Activity.this,str,Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.btn3_3:{
                String str=editText3.getText().toString();
                Toast.makeText(Main3Activity.this,str,Toast.LENGTH_SHORT).show();
                break;
            }
            default:
                break;
        }
    }
}
