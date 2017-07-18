package ramzan.menuexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label=(TextView)findViewById(R.id.label);
        registerForContextMenu(label);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_items,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch(id)
        {
            case R.id.contact:
                Toast.makeText(this,"Contact",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Settings:
                Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show();
        }

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_items,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        switch(id)
        {
            case R.id.contact:
                Toast.makeText(this,"Contact",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Settings:
                Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show();
        }

        return true;

    }
}
