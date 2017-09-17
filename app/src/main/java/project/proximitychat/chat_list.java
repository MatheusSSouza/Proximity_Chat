package project.proximitychat;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class chat_list extends ListActivity {

    String[] itemname ={
        "Jardim Miranda - Grupo do Bairo",
        "Pokemon GO",
        "Grupo da Materia Dificil",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);

        this.setListAdapter(new ArrayAdapter<String>(
                this, R.layout.chat_list,
                R.id.Itemname,itemname));
    }
}
