package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button button1;
    EditText numb1,numb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.buttonOk);

        numb1 = findViewById(R.id.num1);
        numb2 =findViewById(R.id.num2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = numb1.getText().toString();
                String number2 = numb2.getText().toString();
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("number1",number1);
                intent.putExtra("number2",number2);
                startActivity(intent);

                Toast toast= Toast.makeText(getApplicationContext(),"Sending message..",Toast.LENGTH_LONG);
                toast.show();

            }
        });
    }

}