package com.example.mysubmissionview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnimal;
    private ArrayList<Animal> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCenter.start(getApplication(), "3fd2b99a-4d7d-4d4f-b038-a820ead528b4", Analytics.class, Crashes.class);


        rvAnimal = findViewById(R.id.rv_animal);
        rvAnimal.setHasFixedSize(true);

        list.addAll(AnimalData.getListData());
        showRecyclerList();



    }

    private void showRecyclerList(){
        rvAnimal.setLayoutManager(new LinearLayoutManager(this));
        ListAnimalAdapter listAnimalAdaptert = new ListAnimalAdapter(list);
        rvAnimal.setAdapter(listAnimalAdaptert);

        listAnimalAdaptert.setOnItemClickCallback(new ListAnimalAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Animal data) {
                showSelectedAnimal(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_about:
                Intent a = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(a);
            break;
        }
    }

    private void showSelectedAnimal(Animal animal){
        Toast.makeText(this, "Kamu memilih " + animal.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("namahewan", animal.getName().toString());
        intent.putExtra("detailhewan", animal.getDetail().toString());
        intent.putExtra("imghewan", animal.getPhoto());
        startActivity(intent);
    }
}
