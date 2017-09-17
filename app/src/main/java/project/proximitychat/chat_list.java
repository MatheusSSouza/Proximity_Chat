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

//package project.proximitychat;
//
//import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
//import android.view.View;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class chat_list extends AppCompatActivity {
//
//    private ListView lv;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_chat_list);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//
//        setContentView(R.layout.activity_chat_list);
//
//        lv = (ListView) findViewById(R.id.chat_list_view);
//
//        String[] itemname ={
//                "Safari",
//                "Camera",
//                "Global",
//                "FireFox",
//                "UC Browser",
//                "Android Folder",
//                "VLC Player",
//                "Cold War"
//        };
//
//        Integer[] imgid={
//                R.drawable.pokemon_go,
//                R.drawable.pokemon_go,
//                R.drawable.pokemon_go,
//                R.drawable.pokemon_go,
//                R.drawable.pokemon_go,
//                R.drawable.pokemon_go,
//                R.drawable.pokemon_go,
//                R.drawable.pokemon_go,
//        };
//
//        this.setListAdapter(new ArrayAdapter<String>(
//                this, R.layout.mylist,
//                R.id.Itemname,itemname));
//
//        lv.setAdapter(arrayAdapter);
//
////    }
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_chat_list);
////        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
////        setSupportActionBar(toolbar);
////
////        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
////        fab.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
////            }
////        });
////
////        setContentView(R.layout.activity_chat_list);
////
////        lv = (ListView) findViewById(R.id.chat_list_view);
////
//////         Instanciating an array list (you don't need to do this,
//////         you already have yours).
////        List<String> your_array_list = new ArrayList<String>();
////        your_array_list.add("Jardim Miranda - Grupo do Bairo");
////        your_array_list.add("Pokemon GO");
////        your_array_list.add("Grupo da Materia Dificil");
////
////
////        String[] itemname ={
////                "Safari",
////                "Camera",
////                "Global",
////                "FireFox",
////                "UC Browser",
////                "Android Folder",
////                "VLC Player",
////                "Cold War"
////        };
////
////        Integer[] imgid={
////                R.drawable.pokemon_go,
////                R.drawable.pokemon_go,
////                R.drawable.pokemon_go,
////                R.drawable.pokemon_go,
////                R.drawable.pokemon_go,
////                R.drawable.pokemon_go,
////                R.drawable.pokemon_go,
////                R.drawable.pokemon_go,
////        };
////
////
////        // This is the array adapter, it takes the context of the activity as a
////        // first parameter, the type of list view as a second parameter and your
////        // array as a third parameter.
////        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
////                this,
////                android.R.layout.simple_list_item_1,
////                your_array_list );
//////        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
//////                this,
//////                itemname,
//////                imgid);
////
////        lv.setAdapter(arrayAdapter);
////
////    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_chat_list, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//}
