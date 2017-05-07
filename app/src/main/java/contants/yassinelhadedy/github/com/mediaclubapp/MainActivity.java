package contants.yassinelhadedy.github.com.mediaclubapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private ArrayList<phone> albumList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        albumList=new ArrayList<>();
       albumList.add(new phone("as","AS",55));
        albumList.add(new phone("as","AS",55));
        albumList.add(new phone("as","AS",55));
        albumList.add(new phone("as","AS",55));
        albumList.add(new phone("as","AS",55));
     //  read_contacts();

        recyclerView=(RecyclerView)findViewById(R.id.recycleview);



         adapter=new AlbumsAdapter(this,albumList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);

    }
}
