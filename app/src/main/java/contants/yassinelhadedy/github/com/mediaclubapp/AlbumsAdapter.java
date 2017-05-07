package contants.yassinelhadedy.github.com.mediaclubapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Elhadedy on 4/28/2017.
 */

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {

    private Context mContext;
    private List<phone> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView us_name, status;
        public ImageView profile;

        public MyViewHolder(View view) {
            super(view);
            us_name = (TextView) view.findViewById(R.id.username);
            status = (TextView) view.findViewById(R.id.status);
            profile = (ImageView) view.findViewById(R.id.imageView);




        }
    }


    public AlbumsAdapter(Context mContext, List<phone> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemsecond_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        phone album = albumList.get(position);
        holder.us_name.setText("yassin");
        holder.status.setText("elhadedy");
        //Glide.with(mContext).load(album.getProfile()).into(holder.profile);



    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}
