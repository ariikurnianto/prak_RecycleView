package id.ac.itn.latihan_recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclearview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter( this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList(){
        ArrayList<Model> models = new ArrayList<>();
        Model m = new Model();
        m.setTitle("Ari Kurnianto");
        m.setDescription("Jurusan: Teknik Informatika");
        m.setImg(R.drawable.kurni);
        models.add(m);

        m = new Model();
        m.setTitle("Imam Erlangga Prasetya");
        m.setDescription("Jurusan: Teknik Informatika");
        m.setImg(R.drawable.angga);
        models.add(m);

        m = new Model();
        m.setTitle("Bisrul Havi");
        m.setDescription("Jurusan: Teknik Sipil");
        m.setImg(R.drawable.bisrul);
        models.add(m);

        m = new Model();
        m.setTitle("Lismayani");
        m.setDescription("Jurusan: Manajemen");
        m.setImg(R.drawable.lisma);
        models.add(m);

        m = new Model();
        m.setTitle("Khairun Nisa");
        m.setDescription("Jurusan: Kesehatan Masyarakat");
        m.setImg(R.drawable.iyun);
        models.add(m);

        return models;
    }
}