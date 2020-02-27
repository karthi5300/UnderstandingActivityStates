package com.karthick.understandingactivitystates;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

/*When app is opened, the following methods will be called
  onCreate(), onStart(), onResume()

  While in the app, when home button is pressed, the following methods will be called
  onPause(), onStop()

  While in the app, when back button is pressed, the following methods will be called
  onPause(), onStop(), onDestroy()
*/

    public void showToast(String state) {

        Toast toast;
        toast = Toast.makeText(this, state, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String onCreate = getResources().getString(R.string.onCreate);
        showToast(onCreate);

        Log.i("MYTAG", onCreate);
    }

    @Override
    protected void onStart() {
        super.onStart();

        String onStart = getResources().getString(R.string.onStart);
        showToast(onStart);

        Log.i("MYTAG", onStart);
    }

    @Override
    protected void onResume() {
        super.onResume();

        String onResume = getResources().getString(R.string.onResume);
        showToast(onResume);

        Log.i("MYTAG", onResume);
    }

    @Override
    protected void onPause() {
        super.onPause();

        String onPause = getResources().getString(R.string.onPause);
        showToast(onPause);

        Log.i("MYTAG", onPause);
    }

    @Override
    protected void onStop() {
        super.onStop();

        String onStop = getResources().getString(R.string.onStop);
        showToast(onStop);

        Log.i("MYTAG", onStop);
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        String onRestart = getResources().getString(R.string.onRestart);
        showToast(onRestart);

        Log.i("MYTAG", onRestart);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        String onDestroy = getResources().getString(R.string.onDestroy);
        showToast(onDestroy);

        Log.i("MYTAG", onDestroy);
    }

}
