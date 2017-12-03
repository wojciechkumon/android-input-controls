package pl.edu.agh.androidinputcontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPassword(View view) {
        EditText passwordField = findViewById(R.id.passwordField);
        String currentPassword = passwordField.getText().toString();
        TextView passwordView = findViewById(R.id.passwordView);
        passwordView.setText(currentPassword);
    }
}
