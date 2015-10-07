package com.yaowen.edittext;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView;
    private Button et1,et2,et3,et4,et5;//这里输入错了就将就一下了，没必要改了。知道就好了；
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.iv);
        et1=(Button)findViewById(R.id.et1);
        et2=(Button)findViewById(R.id.et2);
        et3=(Button)findViewById(R.id.et3);
        et4=(Button)findViewById(R.id.et4);
        et5=(Button)findViewById(R.id.et5);
        imageView.setImageResource(R.drawable.log1);
        et1.setOnClickListener(this);
        et2.setOnClickListener(this);
        et3.setOnClickListener(this);
        et4.setOnClickListener(this);
        et5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.et1:{
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                break;
            }
            case R.id.et2:{
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
                break;
            }
            case R.id.et3:{
                Intent intent=new Intent(MainActivity.this,Main4Activity.class);
                startActivity(intent);
                break;
            }
            case R.id.et4:{
                Intent intent=new Intent(MainActivity.this,Main5Activity.class);
                startActivity(intent);
                break;
            }
            default: {
                Intent intent = new Intent(MainActivity.this, Main6Activity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
