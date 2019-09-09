package com.example.customadapterlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTraicay;
    ArrayList<TraiCay> arrayTraiCay;
    TraiCayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter = new TraiCayAdapter(this, R.layout.dong_trai_cay, arrayTraiCay);
        lvTraicay.setAdapter(adapter);
    }
    private void AnhXa() {
        lvTraicay = (ListView) findViewById(R.id.listViewTraiCay);

        arrayTraiCay = new ArrayList<>();

        arrayTraiCay.add(new TraiCay("Dâu Tây", "Dâu Tây Đà Lạt", R.drawable.dautay));
        arrayTraiCay.add(new TraiCay("Chuối","Chuối Nam Định", R.drawable.chuoi));
        arrayTraiCay.add(new TraiCay("Cam", "Cam Cao Phong", R.drawable.cam));
        arrayTraiCay.add(new TraiCay("Mang Cụt","Măng Cụt Sapa", R.drawable.mangcut));
    }
}
