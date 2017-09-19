package project.proximitychat;


import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class chat_list extends Activity{

    ListView list;
    String[] itemname ={
            "Jardim Miranda - Grupo do Bairo",
            "Pokemon GO",
            "Grupo da Materia Dificil",
    };

    Integer[] imgid={
            R.drawable.bairro,
            R.drawable.pokemongo,
            R.drawable.estudo,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_chat_list);

        ChatListAdapter adapter=new ChatListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}