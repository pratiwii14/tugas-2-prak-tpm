package com.example.tugas2praktpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    private EditText eNama, eNIM, eNilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);
        eNama = findViewById(R.id.nama);
        eNIM = findViewById(R.id.nim);
        eNilai = findViewById(R.id.nilai);
    }

    public void kirim(View view) {
        try {
            String aNama = eNama.getText().toString();
            String aNIM = eNIM.getText().toString();
            String aNilai = eNilai.getText().toString();
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("nama", aNama);
            intent.putExtra("nim", aNIM);
            intent.putExtra("nilai", aNilai);
            startActivity(intent);
        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }
    }
}

