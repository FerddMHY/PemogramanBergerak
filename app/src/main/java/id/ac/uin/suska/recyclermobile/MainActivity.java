package id.ac.uin.suska.recyclermobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerv);

        List<ItemClass> items = new ArrayList<ItemClass>();
        items.add(new ItemClass("Ferdi", "ferdi@gmail.com", R.drawable.ferdi_model));
        items.add(new ItemClass("Aldi", "aldi@gmail.com", R.drawable.aldi));
        items.add(new ItemClass("Aldo", "aldo@gmail.com", R.drawable.aldo));
        items.add(new ItemClass("Aufa", "aufa@gmail.com", R.drawable.aufa));
        items.add(new ItemClass("Danu", "danu@gmail.com", R.drawable.danu));
        items.add(new ItemClass("Dina", "dina@gmail.com", R.drawable.dina));
        items.add(new ItemClass("Dzaky", "dzaky@gmail.com", R.drawable.dzaky));
        items.add(new ItemClass("Farhan", "farhan@gmail.com", R.drawable.farhan));
        items.add(new ItemClass("Fayat", "fayat@gmail.com", R.drawable.fayat));
        items.add(new ItemClass("Irfan", "irfan@gmail.com", R.drawable.ipan));
        items.add(new ItemClass("Mahen", "mahen@gmail.com", R.drawable.mahen));
        items.add(new ItemClass("Osama", "osama@gmail.com", R.drawable.osama));
        items.add(new ItemClass("Perdi", "perdi@gmail.com", R.drawable.perdi));
        items.add(new ItemClass("Ragil", "ragil@gmail.com", R.drawable.ragil));
        items.add(new ItemClass("Raviko", "raviko@gmail.com", R.drawable.raviko));
        items.add(new ItemClass("Shania", "shania@gmail.com", R.drawable.shania));
        items.add(new ItemClass("Taqwim", "taqwim@gmail.com", R.drawable.taqwim));
        items.add(new ItemClass("Taufik", "taufik@gmail.com", R.drawable.topik));
        items.add(new ItemClass("Ummy", "ummy@gmail.com", R.drawable.ummy));
        items.add(new ItemClass("Yuli", "hehe@gmail.com", R.drawable.yuli));
        items.add(new ItemClass("Wan", "wan@gmail.com", R.drawable.jamau));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterClass(getApplicationContext(), items));
    }
}