package com.example.listy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);
        ArrayList<Rzeczy> arrayList=new ArrayList<>();
      arrayList.add(new Rzeczy(R.drawable.bmw,"BMW"));
      arrayList.add(new Rzeczy(R.drawable.audi,"Audi"));
      arrayList.add(new Rzeczy(R.drawable.fiat,"Fiat"));
      arrayList.add(new Rzeczy(R.drawable.porsche,"Porsche"));
      arrayList.add(new Rzeczy(R.drawable.lambo,"Lamborghini"));
        RzeczyAdapter rzeczyAdapter=new RzeczyAdapter(this,R.layout.list_row,arrayList);
        listView.setAdapter(rzeczyAdapter);
    }
}