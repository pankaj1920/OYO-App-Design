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

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.Category_VH> {

    List<Categorymodel> category_list;

    public CategoryAdapter(List<Categorymodel> category_list) {
        this.category_list = category_list;
    }

    @NonNull
    @Override
    public Category_VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.category_item,viewGroup,false);

        return new Category_VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Category_VH category_vh, int i) {
    category_vh.stateImage.setImageResource(category_list.get(i).getStateImage());
    category_vh.stateName.setText(category_list.get(i).stateName);
    }

    @Override
    public int getItemCount() {
        return category_list.size();
    }

    class Category_VH extends  RecyclerView.ViewHolder{
        TextView stateName;
        ImageView stateImage;

        public Category_VH(@NonNull View itemView) {
            super(itemView);

            stateName = (TextView) itemView.findViewById(R.id.stateName);
            stateImage = (ImageView) itemView.findViewById(R.id.stateImage);
        }
    }
}
