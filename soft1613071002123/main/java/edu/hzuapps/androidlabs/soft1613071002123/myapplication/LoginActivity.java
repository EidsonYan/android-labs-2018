package edu.hzuapps.androidlabs.soft1613071002123.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hww on 2018/5/2.
 */

public class LoginActivity extends AppCompatActivity {
    private String[] data = {"apple", "banana", "orange", "watermelon", "pear", "grape", "pineapple", "strawberry", "cherry", "mango"};
    private List<File> fileList = new ArrayList<File>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                LoginActivity.this, android.R.layout.simple_list_item_1, data);
        ListView listView = findViewById(R.id.liset_view);
        listView.setAdapter(adapter);

        //
        initFiles();
        FileAdapter adapter1 = new FileAdapter(LoginActivity.this, R.layout.file_layout, fileList);
        ListView listView1 = findViewById(R.id.liset_view);
        listView.setAdapter(adapter);
    }

    private void initFiles(){
        File apple = new File("apple", R.drawable.empty);
        fileList.add(apple);
        File banana = new File("banana", R.drawable.empty);
        fileList.add(apple);
        File orange = new File("orange", R.drawable.empty);
        fileList.add(apple);
        File watermelon = new File("watermelon", R.drawable.empty);
        fileList.add(apple);
        File pear = new File("pear", R.drawable.empty);
        fileList.add(apple);
        File grape = new File("grape", R.drawable.empty);
        fileList.add(apple);
        File pineapple = new File("pineapple", R.drawable.empty);
        fileList.add(apple);
        File strawberry = new File("strawberry", R.drawable.empty);
        fileList.add(apple);
        File cherry = new File("cherry", R.drawable.empty);
        fileList.add(apple);
        File mango = new File("mango", R.drawable.empty);
        fileList.add(apple);
    }
}
