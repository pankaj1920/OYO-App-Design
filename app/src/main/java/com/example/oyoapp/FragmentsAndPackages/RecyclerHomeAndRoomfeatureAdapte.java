package com.example.oyoapp.FragmentsAndPackages;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.oyoapp.R;

import java.util.ArrayList;

public class RecyclerHomeAndRoomfeatureAdapte extends RecyclerView.Adapter<RecyclerHomeAndRoomfeatureAdapte.VHadapter> {
 ArrayList<RecyclehomeAndRoomFeatureModel> slist;

    public RecyclerHomeAndRoomfeatureAdapte(ArrayList<RecyclehomeAndRoomFeatureModel> slist) {
        this.slist = slist;
    }

    @NonNull
    @Override
    public VHadapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

      View view=  LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclehomeandroomfeature,viewGroup,false);

        return new VHadapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VHadapter vHadapter, int i) {
        vHadapter.imageView.setImageResource(slist.get(i).getLink());

    }

    @Override
    public int getItemCount() {
        return slist.size();
    }

    public class VHadapter extends RecyclerView.ViewHolder {
ImageView imageView;
        public VHadapter(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imgfeature);
        }
    }
    }

