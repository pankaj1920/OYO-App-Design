package com.example.oyoapp.FragmentsAndPackages;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oyoapp.Activities.ExcitingOffersActivity;
import com.example.oyoapp.R;

import java.util.List;

public class StripThreeAdapter extends RecyclerView.Adapter<StripThreeAdapter.ViewHolder> {
    private List<StripThreeModel> stripThreeModelList;

    public StripThreeAdapter(List<StripThreeModel> stripThreeModelList) {
        this.stripThreeModelList = stripThreeModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.strip4_item_layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int position) {
        int resource=stripThreeModelList.get(position).getLink();
        String title=stripThreeModelList.get(position).getText();


        viewHolder.setProductImage(resource,title);

        viewHolder.productImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(viewHolder.productImage.getContext(), ExcitingOffersActivity.class);
                viewHolder.productImage.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return stripThreeModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView productImage;
        private TextView productTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage=itemView.findViewById(R.id.imageoffer);
            productTitle=itemView.findViewById(R.id.text);
        }

        public void setProductImage(int resource, String title) {
//            productTitle.setText(title);
        }
    }
}
