package com.example.oyoapp.FragmentsAndPackages;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oyoapp.Activities.HotelAndRoomsActivity;
import com.example.oyoapp.R;

import java.util.List;

public class StripFourAdapter extends RecyclerView.Adapter<StripFourAdapter.ViewHolder>{
    private List<StripFourModel>strFourList;

    public StripFourAdapter(List<StripFourModel> strFourList) {
        this.strFourList = strFourList;
    }

    @NonNull
    @Override
    public StripFourAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.strip5_item_layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final StripFourAdapter.ViewHolder viewHolder, int position) {
        String title=strFourList.get(position).getText();



            viewHolder.productImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(viewHolder.productImage.getContext(), HotelAndRoomsActivity.class);
                    viewHolder.productImage.getContext().startActivity(intent);
                }
            });



    }

    @Override
    public int getItemCount() {
        return strFourList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView productImage;
        private TextView productTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage=itemView.findViewById(R.id.imageView3);
            productTitle=itemView.findViewById(R.id.textView3);
        }

        public void setProductImage(int resource, String title) {
            productImage.setImageResource(R.drawable.img1);
        }
    }
}
