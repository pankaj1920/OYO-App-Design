package com.example.oyoapp.FragmentsAndPackages;



import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oyoapp.R;

import java.util.List;

public class StripSixAdapter extends RecyclerView.Adapter<StripSixAdapter.ViewHolder> {
    private List<StripFiveModel> stripSixList;

    public StripSixAdapter(List<StripFiveModel> stripSixList) {
        this.stripSixList = stripSixList;
    }

    @NonNull
    @Override
    public StripSixAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.strip6_item_layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StripSixAdapter.ViewHolder viewHolder, int position) {
        int resource=stripSixList.get(position).getLink();
        String title=stripSixList.get(position).getText();
        viewHolder.setProductImage(resource,title);


    }

    @Override
    public int getItemCount() {
        return stripSixList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView productImage;
        private TextView productTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage=itemView.findViewById(R.id.imageView4);
            productTitle=itemView.findViewById(R.id.textView4);

        }

        public void setProductImage(int resource, String title) {
            productImage.setImageResource(R.drawable.img1);
            productTitle.setText(title);
        }
    }
}

