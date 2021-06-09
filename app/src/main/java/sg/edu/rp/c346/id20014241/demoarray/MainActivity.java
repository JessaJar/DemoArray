package sg.edu.rp.c346.id20014241.demoarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    //String[] fruits;
    ArrayList<String> fruits;
    String text;
    String theFruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);

        //fruits = new String[3];
        //fruits[0] = "apple";
        //fruits[1] = "banana";
        //fruits[2] = "Cherry";

        fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");
        fruits.remove(0);
        fruits.set(fruits.size()-1, "Dragon Fruit");


        text = "Fruits \n";
        text += "=====\n";

        for(int i = 0; i < fruits.size(); i++){
            text += fruits.get(i) + "\n";
            theFruit = fruits.get(1);
        }
        tv.setText(text + theFruit);
    }
}