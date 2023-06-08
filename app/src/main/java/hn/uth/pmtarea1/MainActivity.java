package hn.uth.pmtarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txn1, txn2;
    Button btnsuma, btnresta, btnmulti, btndiv;

    int n1, n2, total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txn1 = findViewById(R.id.txn1);
        txn2 = findViewById(R.id.txn2);

        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btnmulti = (Button) findViewById(R.id.btnmulti);
        btndiv = (Button) findViewById(R.id.btndiv);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1= Integer.parseInt(txn1.getText().toString());
                n2= Integer.parseInt(txn2.getText().toString());

                total=n1+n2;

                //Toast.makeText(MainActivity.this, "La suma es: "+total, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, ActivityResult.class);
                intent.putExtra("respuesta", total);
                startActivity(intent);


            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1= Integer.parseInt(txn1.getText().toString());
                n2= Integer.parseInt(txn2.getText().toString());

                total=n1-n2;

                //Toast.makeText(MainActivity.this, "La suma es: "+total, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, ActivityResult.class);
                intent.putExtra("respuesta", total);
                startActivity(intent);


            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1= Integer.parseInt(txn1.getText().toString());
                n2= Integer.parseInt(txn2.getText().toString());

                total=n1*n2;

                //Toast.makeText(MainActivity.this, "La suma es: "+total, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, ActivityResult.class);
                intent.putExtra("respuesta", total);
                startActivity(intent);


            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1= Integer.parseInt(txn1.getText().toString());
                n2= Integer.parseInt(txn2.getText().toString());

                total=n1/n2;

                //Toast.makeText(MainActivity.this, "La suma es: "+total, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, ActivityResult.class);
                intent.putExtra("respuesta", total);
                startActivity(intent);


            }
        });


    }
}