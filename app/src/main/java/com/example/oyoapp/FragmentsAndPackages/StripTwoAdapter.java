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

public class StripTwoAdapter extends RecyclerView.Adapter<StripTwoAdapter.ViewHolder> {
    private List<StripTwoModel> stripTwoModelList;

    public StripTwoAdapter(List<StripTwoModel> stripTwoModelList) {
        this.stripTwoModelList = stripTwoModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.strip3_layout,viewGroup,false);
      return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
       int resource=stripTwoModelList.get(position).getImage();
        String title=stripTwoModelList.get(position).getText1();
        String desc=stripTwoModelList.get(position).getText2();
      
//        viewHolder.setProductImage(resource,title,desc);

    }

    @Override
    public int getItemCount() {
        return stripTwoModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView productImage;
        private TextView productTitle;
        private TextView productDesc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage=itemView.findViewById(R.id.circleImageView);
           // productTitle=itemView.findViewById(R.id.user_name);
          //  productDesc=itemView.findViewById(R.id.textView5);
        }


        public void setProductImage(int resource, String title, String desc) {
//            productTitle.setText(title);


            productDesc.setText(desc);
        }
    }
}
