package com.cskomra.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void makeToast1(View view){
        Context context = getApplicationContext();
        CharSequence text = "Toast text here";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void makeToast(View v) {
        Context context = getApplicationContext();
        CharSequence text = "";
        int duration = Toast.LENGTH_SHORT;

        switch (v.getId()) {
            case R.id.btn_one:
                // handle button A click;
                text = getString(R.string.btn_one_toast_text);
                break;
            case R.id.btn_two:
                // handle button B click;
                text = getString(R.string.btn_two_toast_text);
                break;
            case R.id.btn_three:
                // handle button B click;
                text = getString(R.string.btn_three_toast_text);
                break;
            case R.id.btn_four:
                // handle button B click;
                text = getString(R.string.btn_four_toast_text);
                break;
            case R.id.btn_five:
                // handle button B click;
                text = getString(R.string.btn_five_toast_text);
                break;
            case R.id.btn_six:
                // handle button B click;
                text = getString(R.string.btn_six_toast_text);
                break;
            default:
                throw new RuntimeException(getString(R.string.btn_unknown_toast_text));
        }
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
