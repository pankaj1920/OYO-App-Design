package com.example.oyoapp.FragmentsAndPackages;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.oyoapp.R;

import java.util.ArrayList;

public class HomeandRoomsCollectionrecyclerAdapter extends RecyclerView.Adapter<HomeandRoomsCollectionrecyclerAdapter.Vhadapter> {
ArrayList<CollectionrecyclerModel>slist;

    public HomeandRoomsCollectionrecyclerAdapter(ArrayList<CollectionrecyclerModel> slist) {
        this.slist = slist;
    }

    @NonNull
    @Override
    public Vhadapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=  LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.collectionrecycleritem,viewGroup,false);

        return new HomeandRoomsCollectionrecyclerAdapter.Vhadapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Vhadapter vhadapter, int i) {
        vhadapter.imageView.setText(slist.get(i).getText());

    }

    @Override
    public int getItemCount() {
        return slist.size();
    }

    public class Vhadapter extends RecyclerView.ViewHolder{
        TextView imageView;
        public Vhadapter(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.collectioncity);
        }
    }
}
