package com.example.secondapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private LinearLayout linearLayout;
    private EditText editText1, editText2;
    private TextView textView1, textView2, textView3;
    String Email = "admin@gmail.com";
    String Password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn1);
        linearLayout = findViewById(R.id.layner1);
        editText1 = findViewById(R.id.Login);
        editText2 = findViewById(R.id.Password);
        textView1 = findViewById(R.id.text1);
        textView2 = findViewById(R.id.text2);
        textView3 = findViewById(R.id.text3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.getText().toString().equals(Email) && editText2.getText().toString().equals(Password)) {
                    editText1.setVisibility(view.GONE);
                    editText2.setVisibility(view.GONE);
                    btn.setVisibility(view.GONE);
                    linearLayout.setVisibility(view.GONE);
                    textView1.setVisibility(view.GONE);
                    textView3.setVisibility(view.GONE);
                    Toast.makeText(MainActivity.this,"Вы успешно зарегистрировались" , Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, "Не правильные данные", Toast.LENGTH_SHORT).show();
            }


        });

        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editText1.getText().toString().length() > 0) {
                    btn.setBackgroundColor(getColor(R.color.orange));
                } else btn.setBackgroundColor(getColor(R.color.gray));
            }
        });
    }}
//        System.out.println("Введите ваши данные");
//        System.out.println("Вы неправильно ввели данные");
