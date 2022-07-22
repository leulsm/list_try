package com.leul.onelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    TextView txn;
    String [] studentlist={"Leul","Solomon","Asefa","Tolcha"};
String[] names={"Leul","Meseret","Beyene","Gareda"};
String [] roles={"SOFTWARE ENGINEER","BACKEND_DEVELOPER","PROGRAMMER","DATABASE_MANAGER"};
Integer[] images={R.drawable.ic_launcher_background,R.drawable.pp,R.drawable.ppp,R.drawable.pppp};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.list);
        txn=findViewById(R.id.list_text1);

//        ArrayAdapter <String> arrayAdapter=new
//                ArrayAdapter<String>(this,R.layout.list_item,R.id.list_text1,studentlist);
//        lv.setAdapter(arrayAdapter);
//
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//                Toast.makeText(getApplicationContext(),studentlist[position],Toast.LENGTH_LONG).show();
//            }
//        });

        customarrayaddapter caa=new customarrayaddapter(this,names,roles,images);
        lv.setAdapter(caa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(getApplicationContext(),studentlist[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}