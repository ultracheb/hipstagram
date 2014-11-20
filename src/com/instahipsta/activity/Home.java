package com.instahipsta.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.instahipsta.R;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Vladislove on 30.10.2014.
 */
public class Home extends FragmentActivity {

    private ListView actions;
    private ArrayList<String> content;
    private ArrayAdapter<String> adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        init();
    }

    private void init (){
        actions = (ListView)findViewById(R.id.listView);
        content = new ArrayList<String>(Arrays.asList("Рыжик", "Барсик", "Мурзик",
                "Мурка", "Васька", "Томасина", "Бобик", "Кристина", "Пушок",
                "Дымка", "Кузя", "Китти", "Барбос", "Жур", "Масяня", "Симба"));
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, content);
        actions.setAdapter(adapter);

    }

    public void onPhotoClick(View v){
        Intent intent = new Intent(Home.this, PhotoSwipe.class);
        startActivity(intent);
    }
}
