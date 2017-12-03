package pl.edu.agh.androidinputcontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private static final String MENU_TAG = "main_menu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.item1:
                Log.i(MENU_TAG,"item 1 clicked!");
                return true;
            case R.id.item2:
                Log.i(MENU_TAG,"item 2 clicked!");
                return true;
            case R.id.item3:
                Log.i(MENU_TAG,"item 3 clicked!");
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
