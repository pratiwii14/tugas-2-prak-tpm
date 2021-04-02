package com.example.tugas2praktpm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView bNama, bNIM, bNilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bNama = findViewById(R.id.bnama);
        bNIM = findViewById(R.id.bnim);
        bNilai = findViewById(R.id.bnilai);

        String nama, nim, t_ipk;
        double ipk;

        nama = getIntent().getStringExtra("nama");
        bNama.setText(nama);

        nim = getIntent().getStringExtra("nim");
        bNIM.setText(nim);

        t_ipk = getIntent().getStringExtra("nilai");
        ipk = Double.parseDouble(t_ipk);
        if (ipk > 3.66 && ipk <= 4) {
            bNilai.setText("A");
        } else if (ipk > 3.33 && ipk <= 3.66) {
            bNilai.setText("A-");
        } else if (ipk > 3 && ipk <= 3.33) {
            bNilai.setText("B+");
        } else if (ipk > 2.66 && ipk <= 3) {
            bNilai.setText("B");
        } else if (ipk > 2.33 && ipk <= 2.66) {
            bNilai.setText("B-");
        } else if (ipk > 2 && ipk <= 2.33) {
            bNilai.setText("C+");
        } else if (ipk > 1.66 && ipk <= 2) {
            bNilai.setText("C");
        } else if (ipk > 1.33 && ipk <= 1.66) {
            bNilai.setText("C-");
        } else if (ipk > 1 && ipk <= 1.33) {
            bNilai.setText("D+");
        } else if (ipk == 1) {
            bNilai.setText("D");
        }
    }
}
