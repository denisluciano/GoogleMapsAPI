package denis.luciano.mapas_googlemapsapi;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_map);

        String menu [] = new String[] {"Minha casa na cidade natal", "Minha casa em viçosa", "Meu departamento","Fechar aplicação"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu);

        setListAdapter(arrayAdapter);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        Intent it = new Intent(getBaseContext(),MapsActivity.class);
        String aux = l.getItemAtPosition(position).toString();

        switch (position){
            case 0:
                it.putExtra("tipo",0);
                startActivity(it);
                break;
            case 1:
                it.putExtra("tipo",1);
                startActivity(it);
                break;
            case 2:
                it.putExtra("tipo",2);
                startActivity(it);
                break;
            default:
                finish();

        }

    }
}
