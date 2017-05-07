package contants.yassinelhadedy.github.com.mediaclubapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Elhadedy on 5/6/2017.
 */

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.MyViewHolder> {
    private Context context;
    private List<String> personList;

    public SecondAdapter(Context context, List<String> personList) {
        this.context = context;
        this.personList = personList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_second2, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        String s=personList.get(position);
        holder.us_name.setText("yassin");
      //  holder.Status.setText("elhadedy");



    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView us_name,Status;
       // ImageView pending;


        public MyViewHolder(View itemView) {
            super(itemView);
            us_name=(TextView)itemView.findViewById(R.id.username);
           // Status=(TextView)itemView.findViewById(R.id.status);
           // pending=(ImageView)itemView.findViewById(R.id.imageView);

        }
    }


}
