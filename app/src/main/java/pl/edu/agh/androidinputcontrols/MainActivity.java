package pl.edu.agh.androidinputcontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.textSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.text_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void showToast(View view) {
        RadioButton shortToastRadio = findViewById(R.id.shortToast);
        Spinner textSpinner = findViewById(R.id.textSpinner);
        ToggleButton uppercaseToggle = findViewById(R.id.uppercaseToggle);

        String text = textSpinner.getSelectedItem().toString();
        if (uppercaseToggle.isChecked()) {
            text = text.toUpperCase();
        }
        int duration = shortToastRadio.isChecked() ? Toast.LENGTH_SHORT : Toast.LENGTH_LONG;
        showToast(text, duration);
    }

    private void showToast(String text, int duration) {
        Toast.makeText(getApplicationContext(), text, duration)
                .show();
    }
}
