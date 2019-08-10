package com.example.oyoapp.FragmentsAndPackages;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oyoapp.Activities.ActivityBeach;
import com.example.oyoapp.Activities.ActivityFort;
import com.example.oyoapp.Activities.WeekEndGateHillActivity;
import com.example.oyoapp.R;

import java.util.List;

public class StripEigAdapter extends RecyclerView.Adapter<StripEigAdapter.ViewHolder> {
    private List<StripEigModel> stripEigList;

    public StripEigAdapter(List<StripEigModel> stripEigList) {
        this.stripEigList = stripEigList;
    }


    @Override
    public StripEigAdapter.ViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.srip8_item_layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final StripEigAdapter.ViewHolder viewHolder, int position) {
        int resource=stripEigList.get(position).getLink();
        String title=stripEigList.get(position).getText();
        viewHolder.setProductImage(resource,title);


         if(position==0)
        viewHolder.productImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(viewHolder.productImage.getContext(), WeekEndGateHillActivity.class);
                viewHolder.productImage.getContext().startActivity(intent);
            }
        });
        if(position==1)
            viewHolder.productImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent =new Intent(viewHolder.productImage.getContext(), ActivityBeach.class);
                    viewHolder.productImage.getContext().startActivity(intent);
                }
            });
        if(position==2)
            viewHolder.productImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent =new Intent(viewHolder.productImage.getContext(), ActivityFort.class);
                    viewHolder.productImage.getContext().startActivity(intent);
                }
            });

    }

    @Override
    public int getItemCount() {
        return stripEigList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView productImage;
        private TextView productTitle;
        public ViewHolder( View itemView) {

            super(itemView);
            productImage=itemView.findViewById(R.id.imageView5);
           // productTitle=itemView.findViewById(R.id.textView5);
        }

        public void setProductImage(int resource, String title) {
//            productTitle.setText(title);
        }
    }
}
