package com.example.scroll;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class HeroesDetail extends AppCompatActivity {

    ImageView imageView;
    TextView nama, deskripsi;
    String data1, data2;
    int imageV;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_hero);

        imageView = findViewById(R.id.data_gambar);
        nama = findViewById(R.id.data_nama);
        deskripsi = findViewById(R.id.data_deskripsi);

        getData();
        setData();
    }

    private void getData(){
        if (getIntent().hasExtra("imageV") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")){
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            imageV = getIntent().getIntExtra("imageV", 1);
        }
        else{
            Toast.makeText(this, "Tidak Ada Data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        nama.setText(data1);
        deskripsi.setText(data2);
        imageView.setImageResource(imageV);
    }

}
