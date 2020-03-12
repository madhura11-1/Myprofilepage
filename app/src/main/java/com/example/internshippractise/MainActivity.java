package com.example.internshippractise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ramotion.foldingcell.FoldingCell;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab;
    ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapse);
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.argb(255, 255, 255, 255));
        collapsingToolbarLayout.setExpandedTitleColor(Color.parseColor("#F0F1F5"));
        collapsingToolbarLayout.setContentScrimColor(Color.parseColor("#438AD5"));
        Toolbar toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        fab = findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_edit);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bottombar bottombar = Bottombar.newInstance();
                bottombar.setParentFab(fab);
                bottombar.show(getSupportFragmentManager(), bottombar.getTag());
            }
        });

        final FoldingCell fc = findViewById(R.id.folding_cell);
        final FoldingCell fc1 = findViewById(R.id.folding_cell1);
        final FoldingCell fc2 = findViewById(R.id.folding_cell2);
        final FoldingCell fc3 = findViewById(R.id.folding_cell3);
        final FoldingCell fc4 = findViewById(R.id.folding_cell4);
        final FoldingCell fc5 = findViewById(R.id.folding_cell5);


        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fc.toggle(false);
            }
        });

        fc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fc1.toggle(false);
            }
        });
        fc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fc2.toggle(false);
            }
        });
        fc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fc3.toggle(false);
            }
        });
        fc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fc4.toggle(false);
            }
        });
        fc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fc5.toggle(false);
            }
        });



    }
}
