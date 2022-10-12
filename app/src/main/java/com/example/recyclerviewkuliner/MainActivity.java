package com.example.recyclerviewkuliner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rec_Kuliner;
    private ArrayList<Kuliner> listKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Kuliner = findViewById(R.id.rec_Kuliner);
        initData();

        rec_Kuliner.setAdapter(new KulinerAdapter(listKuliner));
        rec_Kuliner.setLayoutManager(new LinearLayoutManager(this));
    }
    private void initData(){
        this.listKuliner = new ArrayList<>();
        listKuliner.add(new Kuliner("Angkringan Polke",
                "JL. Pamularsih Raya, Semarang",
                "Angkringan Paling Polke di Semarang",
                R.drawable.menu1));
        listKuliner.add(new Kuliner("Angkringan SakJose",
                "JL. Pamularsih Raya, Semarang",
                "Angkringan Paling Polke di Semarang",
                R.drawable.menu2));
        listKuliner.add(new Kuliner("Angkringan Babeh",
                "JL. Pamularsih Raya, Semarang",
                "Angkringan Paling Polke di Semarang",
                R.drawable.menu3));
        listKuliner.add(new Kuliner("Angkringan EnakTenan",
                "JL. Pamularsih Raya, Semarang",
                "Angkringan Paling Polke di Semarang",
                R.drawable.menu4));
        listKuliner.add(new Kuliner("Angkringan NambahTerus",
                "JL. Pamularsih Raya, Semarang",
                "Angkringan Paling Polke di Semarang",
                R.drawable.menu5));

    }
}