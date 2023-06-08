package hn.uth.pmtarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {

    TextView tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        int recibirRespuesta = intent.getIntExtra("respuesta", 0);

        tvresult = findViewById(R.id.tvresult);
        tvresult.setText("El resultado es: "+recibirRespuesta);


    }
}