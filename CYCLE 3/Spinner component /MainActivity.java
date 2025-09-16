package com.example.s3mca55;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
public class MainActivity extends AppCompatActivity {
 String [] names= {"Item1", "Item2", "Item3"};
 String [] des= {"Item1 Text", "item2 Text", "Item3 Text"};
 ArrayAdapter adapter;
 Spinner spinner;
 TextView selectedItems;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 spinner = findViewById(R.id.spinner);
 selectedItems = findViewById(R.id.textView);
 adapter = new 
ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,names);spinner.setAdapter(adapter);
 spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
 @Override
 public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
 switch (i){
 case 0:
 selectedItems.setText(""+des[i]);
 break;
 case 1:
 selectedItems.setText(""+des[i]);
 break;
 case 2:
 selectedItems.setText(""+des[i]);
 break;
 }
 }
 @Override
 public void onNothingSelected(AdapterView<?> adapterView) {
 }
 });
 }
}
