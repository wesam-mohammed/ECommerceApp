package com.example.ecommerceapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder> {

    private final List<Product> productList;

    public ProductAdapter(List<Product> productList) {
        this.productList = productList;
    }

    static class ProductHolder extends RecyclerView.ViewHolder {
        final ImageView imgProduct;
        final TextView txtProductName;
        final TextView txtProductPrice;

        ProductHolder(@NonNull View itemView) {
            super(itemView);
            imgProduct = itemView.findViewById(R.id.ivProduct);
            txtProductName = itemView.findViewById(R.id.tvProductName);
            txtProductPrice = itemView.findViewById(R.id.tvProductPrice);
        }
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        return new ProductHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
        Product product = productList.get(position);
        holder.txtProductName.setText(product.name);
        holder.txtProductPrice.setText(product.price);
        holder.imgProduct.setImageResource(product.imageResId);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}