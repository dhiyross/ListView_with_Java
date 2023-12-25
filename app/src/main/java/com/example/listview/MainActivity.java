package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends ListActivity {
    TextView selection;
    String[]
            items={"Rossy", "Rakha Wisnu", "Yuta Nakamoto"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
        selection = (TextView)findViewById(R.id.textView);
    }
    public void onListItemClick(ListView parent, View v, int position, long id){
        selection.setText(items[position]);
    }
}