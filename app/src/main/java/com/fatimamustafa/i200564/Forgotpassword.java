package com.fatimamustafa.i200564;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Forgotpassword extends AppCompatActivity {

    private Button resetPasswordButton;
    private TextView goBackTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);

        resetPasswordButton = findViewById(R.id.resetpassword);
        goBackTextView = findViewById(R.id.goback);

        resetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Forgotpassword.this, MainActivity.class);
                startActivity(intent);
            }
        });

        goBackTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Forgotpassword.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
