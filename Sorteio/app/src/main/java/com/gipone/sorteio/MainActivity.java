package com.gipone.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicar(View view){
        TextView sorteio=findViewById(R.id.valorSorteio);
        sorteio.setText("O valor foi : "+ new Random().nextInt(11) );


    }
}
