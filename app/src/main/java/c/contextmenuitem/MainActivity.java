package c.contextmenuitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // declaration of text view for cotext menu
        TextView textView=findViewById(R.id.textview);

        // Assigning contextmenu on text view
        registerForContextMenu(textView);
    }

    // Declaring context menu via contextmenu.xml
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.contextmenu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    //Toast on menu item selected
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action1:
                Toast.makeText(this, "Action 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action2:
                Toast.makeText(this, "Action 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action3:
                Toast.makeText(this, "Action 3", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}
