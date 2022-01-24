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
import com.example.multimulti.databinding.Activity2Binding;
import com.example.multimulti.databinding.ActivityMainBinding;

public class Activity2 extends AppCompatActivity {
    private Activity2Binding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = Activity2Binding.inflate(getLayoutInflater());
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
                Intent i = new Intent(Activity2.this, MainActivity.class);
                startActivity(i);
            case R.id.activity1:
                Intent i2 = new Intent(Activity2.this, Activity1.class);
                startActivity(i2);
        }

        return super.onOptionsItemSelected(item);
    }
}
