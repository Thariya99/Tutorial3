package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText Snum1, Snum2;
    TextView viewR;
    Button butnadd ,butnsub, butnmul, butndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Snum1 = findViewById(R.id.edittxt1);
        Snum2 = findViewById(R.id.edittxt2);
        viewR =findViewById(R.id.text);

        butnadd = findViewById(R.id.btnadd);
        butnsub = findViewById(R.id.btnsub);
        butnmul = findViewById(R.id.btnmul);
        butndiv = findViewById(R.id.btndiv);

        String nm1 = getIntent().getStringExtra("number1");
        String nm2 = getIntent().getStringExtra("number2");

        Snum1.setText(nm1);
        Snum2.setText(nm2);

        butnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberO = Integer.parseInt(Snum1.getText().toString());
                int numberT = Integer.parseInt(Snum2.getText().toString());
                int btnadd = numberO+numberT;
                viewR.setText((numberO)+"+"+(numberT)+"="+(btnadd));


            }
        });
        butnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberO = Integer.parseInt(Snum1.getText().toString());
                int numberT = Integer.parseInt(Snum2.getText().toString());
                int btnsub = numberO - numberT;
                viewR.setText((numberO)+"-"+(numberT)+"="+(btnsub));
            }
        });
        butnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberO = Integer.parseInt(Snum1.getText().toString());
                int numberT = Integer.parseInt(Snum2.getText().toString());
                int btnmul = numberO * numberT;
                viewR.setText((numberO)+"*"+(numberT)+"="+(btnmul));
            }
        });
        butndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberO = Integer.parseInt(Snum1.getText().toString());
                int numberT = Integer.parseInt(Snum2.getText().toString());
                int btndiv = numberO / numberT;
                viewR.setText((numberO)+"/"+(numberT)+"="+(btndiv));
            }
        });

    }
}