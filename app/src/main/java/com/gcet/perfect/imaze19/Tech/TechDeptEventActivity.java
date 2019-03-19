package com.gcet.perfect.imaze19.Tech;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
import android.widget.Toast;

import com.gcet.perfect.imaze19.R;

public class TechDeptEventActivity extends AppCompatActivity {
    ListView listView;
    String[] items;
    int[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(com.gcet.perfect.imaze19.R.layout.activity_tech_dept_event);

        listView = (ListView) findViewById(com.gcet.perfect.imaze19.R.id.techDeptListView);

        Intent intent = getIntent();

        String dept = intent.getStringExtra("dept");

        if (dept.equals("CyberSorcerers")){
            //Toast.makeText(TechDeptEventActivity.this,""+dept,Toast.LENGTH_SHORT).show();
            items = new String[]{"Coders 007", "Tech-arena", "V R Coders"};
            images= new int[]{R.drawable.list,R.drawable.list,R.drawable.list};

            CustomAdapter customAdapter = new CustomAdapter();
            listView.setAdapter(customAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Coders 007");
                        startActivity(intent1);
                    }

                    if (i == 1){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Tech-arena");
                        startActivity(intent1);
                    }

                    if (i == 2){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","V R Coders");
                        startActivity(intent1);
                    }
                }
            });
        }

        if (dept.equals("Mechadruids")){
            //Toast.makeText(TechDeptEventActivity.this,""+dept,Toast.LENGTH_SHORT).show();
            items = new String[]{"Hawkeye","Lift Off","Spectra"};
            images= new int[]{R.drawable.list,R.drawable.list,R.drawable.list};

            CustomAdapter customAdapter = new CustomAdapter();
            listView.setAdapter(customAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Hawkeye");
                        startActivity(intent1);
                    }

                    if (i == 1){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Lift Off");
                        startActivity(intent1);
                    }

                    if (i == 2){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Spectra");
                        startActivity(intent1);
                    }
                }
            });
        }

        if (dept.equals("Chemo-Mavericks")){
            //Toast.makeText(TechDeptEventActivity.this,""+dept,Toast.LENGTH_SHORT).show();
            items = new String[]{"Chemistry Unplugged","Chem-O-Car","Chem-O-Cool"};
            images= new int[]{R.drawable.list,R.drawable.list,R.drawable.list};

            CustomAdapter customAdapter = new CustomAdapter();
            listView.setAdapter(customAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Chemistry Unplugged");
                        startActivity(intent1);
                    }

                    if (i == 1){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Chem-O-Car");
                        startActivity(intent1);
                    }

                    if (i == 2){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Chem-O-Cool");
                        startActivity(intent1);
                    }
                }
            });
        }

        if (dept.equals("Elecktrowizards")){
            //Toast.makeText(TechDeptEventActivity.this,""+dept,Toast.LENGTH_SHORT).show();
            items = new String[]{"Abhedya","Electro-Buzz"};
            images= new int[]{R.drawable.list,R.drawable.list,R.drawable.list};

            CustomAdapter customAdapter = new CustomAdapter();
            listView.setAdapter(customAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Abhedya");
                        startActivity(intent1);
                    }

                    if (i == 1){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Electro-Buzz");
                        startActivity(intent1);
                    }
                }
            });
        }

        if (dept.equals("Circuityrants")){
            //Toast.makeText(TechDeptEventActivity.this,""+dept,Toast.LENGTH_SHORT).show();
            items = new String[]{"Captain Electrica","Ideathon"};
            images= new int[]{R.drawable.list,R.drawable.list,R.drawable.list};

            CustomAdapter customAdapter = new CustomAdapter();
            listView.setAdapter(customAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Captain Electrica");
                        startActivity(intent1);
                    }

                    if (i == 1){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Ideathon");
                        startActivity(intent1);
                    }
                }
            });
        }

        if (dept.equals("ConcreteChiefs")){
            //Toast.makeText(TechDeptEventActivity.this,""+dept,Toast.LENGTH_SHORT).show();
            items = new String[]{"Clay Craft","Helipad","Trouble Tower"};
            images= new int[]{R.drawable.list,R.drawable.list,R.drawable.list};

            CustomAdapter customAdapter = new CustomAdapter();
            listView.setAdapter(customAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Clay Craft");
                        startActivity(intent1);
                    }

                    if (i == 1){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Helipad");
                        startActivity(intent1);
                    }

                    if (i == 2){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Trouble Tower");
                        startActivity(intent1);
                    }
                }
            });
        }

        if (dept.equals("Robosmics")){
            //Toast.makeText(TechDeptEventActivity.this,""+dept,Toast.LENGTH_SHORT).show();
            items = new String[]{"Hydraunix","Quest for the Best","Roads of Thrylos"};
            images= new int[]{R.drawable.list,R.drawable.list,R.drawable.list};

            CustomAdapter customAdapter = new CustomAdapter();
            listView.setAdapter(customAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Hydraunix");
                        startActivity(intent1);
                    }

                    if (i == 1){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Quest for the Best");
                        startActivity(intent1);
                    }

                    if (i == 2){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Roads of Thrylos");
                        startActivity(intent1);
                    }
                }
            });
        }

        if (dept.equals("Digienchanters")){
            //Toast.makeText(TechDeptEventActivity.this,""+dept,Toast.LENGTH_SHORT).show();
            items = new String[]{"Foo-De-Code","Techn-O-Philia","Webisode"};
            images= new int[]{R.drawable.list,R.drawable.list,R.drawable.list};

            CustomAdapter customAdapter = new CustomAdapter();
            listView.setAdapter(customAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    if (i == 0){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Foo-De-Code");
                        startActivity(intent1);
                    }

                    if (i == 1){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Techn-O-Philia");
                        startActivity(intent1);
                    }

                    if (i == 2){
                        Intent intent1 = new Intent(TechDeptEventActivity.this,Coders007Activity.class);
                        intent1.putExtra("eventname","Webisode");
                        startActivity(intent1);
                    }
                }
            });
        }
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
            textView.setText(items[position]);

            Animation animation = AnimationUtils.loadAnimation(TechDeptEventActivity.this,R.anim.scale);
            convertView.startAnimation(animation);

            return convertView;
        }
    }
}
