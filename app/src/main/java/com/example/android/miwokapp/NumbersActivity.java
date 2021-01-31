package com.example.android.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("one");
        Word w = new Word("one","lutti",R.drawable.number_one);                     //method 1
        words.add(w);
        words.add(new Word("two", "otiiko",R.drawable.number_two));              //method 2 - writing directly
        words.add(new Word("three", "tolookosu",R.drawable.number_three));
        words.add(new Word("four", "oyyisa",R.drawable.number_four));
        words.add(new Word("five", "massokka",R.drawable.number_five));
        words.add(new Word("six", "temmokka",R.drawable.number_six));
        words.add(new Word("seven", "kenekaku",R.drawable.number_seven));
        words.add(new Word("eight", "kawinta",R.drawable.number_eight));
        words.add(new Word("nine", "wo’e",R.drawable.number_nine));
        words.add(new Word("ten", "na’aacha",R.drawable.number_ten));


        /*
        LinearLayout rootView =(LinearLayout)findViewById(R.id.rootView);
       for(int i=0;i<words.size();i++) {
           TextView wordView = new TextView(this);
           wordView.setText(words.get(i));
           rootView.addView(wordView);
       }*/


        /*ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.list_item, words);*/

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }
}