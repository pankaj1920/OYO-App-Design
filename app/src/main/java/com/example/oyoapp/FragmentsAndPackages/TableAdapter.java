package com.example.oyoapp.FragmentsAndPackages;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.oyoapp.Activities.LimitedPeroidOfferActivity;
import com.example.oyoapp.Activities.OfferEndActivity;
import com.example.oyoapp.R;

import java.util.List;

public class TableAdapter extends RecyclerView.Adapter<TableAdapter.ViewHolder> {
    private List<HorizontalModel> horizontalProductScrollModelList;
    Context mcontex;

    public TableAdapter(List<HorizontalModel> horizontalProductScrollModelList, Context mcontex) {
        this.horizontalProductScrollModelList = horizontalProductScrollModelList;
        this.mcontex = mcontex;
    }

    public TableAdapter(List<HorizontalModel> horizontalModels) {
        this.horizontalProductScrollModelList=horizontalModels;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.table_item_layout,viewGroup,false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        int icon=horizontalProductScrollModelList.get(i).getLink();



        viewHolder.setProductImage(icon);
        if(i==0)
        viewHolder.productImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(viewHolder.productImage.getContext(), LimitedPeroidOfferActivity.class);
                viewHolder.productImage.getContext().startActivity(intent);
            }
        });
        else if(i==1)
            viewHolder.productImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent =new Intent(viewHolder.productImage.getContext(), OfferEndActivity.class);
                    viewHolder.productImage.getContext().startActivity(intent);
                }
            });
        else
            viewHolder.productImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent =new Intent(viewHolder.productImage.getContext(), LimitedPeroidOfferActivity.class);
                    viewHolder.productImage.getContext().startActivity(intent);
                }
            });

    }

    @Override
    public int getItemCount() {
        return horizontalProductScrollModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView productImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.imglimitedoffer);


        }

        public void setProductImage(int resource) {
            productImage.setImageResource(resource);
        }
    }
}
