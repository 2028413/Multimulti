package com.example.multimulti;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.multimulti.databinding.Activity1Binding;
import com.example.multimulti.databinding.ActivityMainBinding;

public class Activity1 extends AppCompatActivity {
    private Activity1Binding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("Activity1");

        binding = Activity1Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.main_activity:
                Intent i = new Intent(Activity1.this, MainActivity.class);
                startActivity(i);
            case R.id.activity2:
                Intent i3 = new Intent(Activity1.this, Activity2.class);
                startActivity(i3);
        }

        return super.onOptionsItemSelected(item);
    }
}
