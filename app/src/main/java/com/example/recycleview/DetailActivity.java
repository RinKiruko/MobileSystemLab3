package com.example.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView itemTitle, itemContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        itemTitle = findViewById(R.id.itemTitle);
        itemContent = findViewById(R.id.itemContent);

        Intent intent = getIntent();

        DummyContent.DummyItem item = (DummyContent.DummyItem) intent.getSerializableExtra("ITEM");

        itemTitle.setText(item.title);
        itemContent.setText(item.details);

    }
}