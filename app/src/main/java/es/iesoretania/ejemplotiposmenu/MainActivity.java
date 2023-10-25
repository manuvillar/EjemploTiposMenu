package es.iesoretania.ejemplotiposmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import es.iesoretania.ejemplotiposmenu.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        registerForContextMenu(binding.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.idmenu1){
            Toast.makeText(this, "Pulsada primera opción", Toast.LENGTH_SHORT).show();
            return true;
        }else if (item.getItemId() == R.id.idmenu2){
            Toast.makeText(this, "Pulsada segunda opción", Toast.LENGTH_SHORT).show();
            return true;
        }else{
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.idmenu1){
            Toast.makeText(this, "Pulsada primera opción", Toast.LENGTH_SHORT).show();
            return true;
        }else if (item.getItemId() == R.id.idmenu2){
            Toast.makeText(this, "Pulsada segunda opción", Toast.LENGTH_SHORT).show();
            return true;
        }else{
            return super.onOptionsItemSelected(item);
        }
    }
}