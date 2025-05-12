package com.cs2415.staggerdevents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rcv_user);
        userAdapter = new UserAdapter();
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        userAdapter.setData(getListUser());
        recyclerView.setAdapter(userAdapter);
    }

    private List<User> getListUser() {
        List list = new ArrayList<>();
        list.add(new User(R.drawable.kashmir_rily, "img2"));
        list.add(new User(R.drawable.img2,"Img1"));
        list.add(new User(R.drawable.img3, "img2"));
        list.add(new User(R.drawable.img4, "img3"));
        list.add(new User(R.drawable.img6, "img4"));
        list.add(new User(R.drawable.img7, "img5"));
        list.add(new User(R.drawable.img5, "img6"));


        return list;
    }
}
