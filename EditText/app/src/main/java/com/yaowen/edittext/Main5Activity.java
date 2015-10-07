package com.yaowen.edittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    private EditText editText1,editText2,editText3,editText4,editText5,editText6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        editText1= (EditText) findViewById(R.id.txtTest0);
        editText2= (EditText) findViewById(R.id.txtTest1);
        editText3= (EditText) findViewById(R.id.txtTest2);
        editText4= (EditText) findViewById(R.id.txtTest3);
        editText5= (EditText) findViewById(R.id.txtTest4);
        editText6= (EditText) findViewById(R.id.txtTest5);
        editText1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId== EditorInfo.IME_ACTION_GO){
                    Toast.makeText(Main5Activity.this,"你点了软键盘'去往'按钮",Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
        editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId==EditorInfo.IME_ACTION_SEARCH){
                    Toast.makeText(Main5Activity.this,"你点了软键盘'搜索'按钮",Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
        editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId==EditorInfo.IME_ACTION_SEND){
                    Toast.makeText(Main5Activity.this,"你点了软键盘'发送'按钮",Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
        editText4.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId==EditorInfo.IME_ACTION_NEXT){
                    Toast.makeText(Main5Activity.this,"你点了软键盘'下一个'按钮",Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
        editText5.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId==EditorInfo.IME_ACTION_DONE){
                    Toast.makeText(Main5Activity.this,"你点了软键盘'完成'按钮",Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
        editText6.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId==EditorInfo.IME_ACTION_UNSPECIFIED){
                    Toast.makeText(Main5Activity.this,"你点了软键盘'未指定'按钮",Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });


    }

}
