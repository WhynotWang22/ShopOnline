package com.qlshopquanaonhom6.shoponline.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

import com.qlshopquanaonhom6.shoponline.R;

public class LienHectivity extends AppCompatActivity {
Toolbar toolbarlienhe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lien_hectivity);
        Anhxa();
        ActionToolbar();
    }

    private void ActionToolbar() {
      setSupportActionBar(toolbarlienhe);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbarlienhe.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void Anhxa() {
        toolbarlienhe = findViewById(R.id.toolbarlienhe);
    }
}