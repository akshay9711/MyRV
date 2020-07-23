package com.example.myrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //5 STEPS OF RECYCLERVIEW

    //1. Create RecyclerView and setLayoutManager
    //2. Create item layout design
    //3. Create Model Class
    //4. Create Adapter Class
    //   A) Create viewholder Class
    //   B) Implement Methods
    //5.Create list and set adapter
//_________________________________________________________________________________________________
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add( new ModelClass(R.drawable.ic_launcher_background, "Java"));
        modelClassList.add( new ModelClass(R.drawable.ic_launcher_background, "IntelliJ"));
        modelClassList.add( new ModelClass(R.drawable.ic_launcher_foreground, "AndroidStudio"));
        modelClassList.add( new ModelClass(R.drawable.ic_launcher_background, "C#"));
        modelClassList.add( new ModelClass(R.drawable.ic_launcher_background, "Unity3D"));
        modelClassList.add( new ModelClass(R.drawable.ic_launcher_background, "GooglePlayStore"));

        Adapter adapter = new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}