package com.example.ecommerceapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Bitzwolf B-CC1 Camera 1080P", "US$48.89", R.drawable.camera_one));
        productList.add(new Product("Bitzwolf B-CC1 Camera 1080P", "US$55.89", R.drawable.camera_two));
        productList.add(new Product("Bitzwolf B-CC1 Camera 1080P", "US$78.89", R.drawable.camera_three));
        productList.add(new Product("Bitzwolf B-CC1 Camera 1080P", "US$88.55", R.drawable.camera_four));
        productList.add(new Product("Bitzwolf B-CC1 Camera 1080P", "US$23.67", R.drawable.camera_six));
        productList.add(new Product("Bitzwolf B-CC1 Camera 1080P", "US$44.89", R.drawable.camera_five));
        productList.add(new Product("Bitzwolf B-CC1 Camera 1080P", "US$78.89", R.drawable.camera_one));
        productList.add(new Product("Bitzwolf B-CC1 Camera 1080P", "US$88.55", R.drawable.camera_four));
        productList.add(new Product("Bitzwolf B-CC1 Camera 1080P", "US$23.67", R.drawable.camera_two));
        productList.add(new Product("Bitzwolf B-CC1 Camera 1080P", "US$44.89", R.drawable.camera_three));
        RecyclerView recyclerView = findViewById(R.id.recyclerViewProducts);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        ProductAdapter adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);
    }
}