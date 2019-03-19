package com.gcet.perfect.imaze19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.gcet.perfect.imaze19.Tech.Coders007Activity;

public class NonTechActivity extends AppCompatActivity {

    String[] names = {"Ad Bakers","Crime Investigation Squad","Click The Magic","Coffee With Contrives","Cyclimpic","IPL Auction","Stock Bull","Lasertron","Sarcasters #303","Golden Snitch","Food Hunt 3.0","Counter Strike Extreme Masters","PUBG Mobile Star Challenge GCET","Master Chef GCET","AstroQuest","The Survival"};
    int[] images = {R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ListView listView;
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_non_tech);

        listView = (ListView) findViewById(R.id.nontechListView);
        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(TechActivity.this,""+i,Toast.LENGTH_SHORT).show();

                if (i == 0) {

                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "Ad Bakers");
                    startActivity(intent);
                } else if (i == 1) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "Crime Investigation Squad");
                    startActivity(intent);
                } else if (i == 2) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "Click The Magic");
                    startActivity(intent);

                } else if (i == 3) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "Coffee With Contrives");
                    startActivity(intent);

                } else if (i == 4) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "Cyclimpic");
                    startActivity(intent);

                } else if (i == 5) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "IPL Auction");
                    startActivity(intent);

                } else if (i == 6) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "Stock Bull");
                    startActivity(intent);

                } else if (i == 7) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "Lasertron");
                    startActivity(intent);

                } else if (i == 8) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "Sarcasters #303");
                    startActivity(intent);

                } else if (i == 9) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "Golden Snitch");
                    startActivity(intent);

                } else if (i == 10) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "Food Hunt 3.0");
                    startActivity(intent);

                } else if (i == 11) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "Counter Strike Extreme Masters");
                    startActivity(intent);

                } else if (i == 12) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "PUBG Mobile Star Challenge GCET");
                    startActivity(intent);

                } else if (i == 13) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "Master Chef GCET");
                    startActivity(intent);

                } else if (i == 14) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "AstroQuest");
                    startActivity(intent);

                } else if (i == 15) {
                    Intent intent = new Intent(NonTechActivity.this, Coders007Activity.class);
                    intent.putExtra("nteventname", "The Survival");
                    startActivity(intent);

                }
            }
        });
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = getLayoutInflater().inflate(R.layout.custom_layout,parent,false);

            convertView.setBackgroundResource(R.drawable.customlistshap);

            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
            TextView textView = (TextView) convertView.findViewById(R.id.textView);

            imageView.setImageResource(images[position]);
            textView.setText(names[position]);

            Animation animation = AnimationUtils.loadAnimation(NonTechActivity.this,R.anim.scale);
            convertView.startAnimation(animation);

            return convertView;
        }
    }
}
