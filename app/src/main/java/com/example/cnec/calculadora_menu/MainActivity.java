package com.example.cnec.calculadora_menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch(item.getItemId()) {
            case R.id.idsomar:
                intent = new Intent(this, SOMAR.class);
                startActivity(intent);
                break;
            case R.id.idsubtrair:
                Toast.makeText(getApplicationContext(), "Subtrair", Toast.LENGTH_LONG).show();
                break;
            case R.id.idmultiplicar:
                Toast.makeText(getApplicationContext(), "Multiplicar", Toast.LENGTH_LONG).show();
                break;
            case R.id.iddividir:
                Toast.makeText(getApplicationContext(), "Dividir", Toast.LENGTH_LONG).show();
                break;
        }

        return true;
    }

}

