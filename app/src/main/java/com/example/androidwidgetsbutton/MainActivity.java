package com.example.androidwidgetsbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getDataeditText = editText.getText().toString();
                if (TextUtils.isEmpty(getDataeditText)){// bu metot ile gonderilen veri dolu mu bos mu kontrol edilir
                    textView.setText("is not Data");
                }else{
                        textView.setText("" + getDataeditText);
                        editText.setText("");
            }

            }
        });
    }
}
