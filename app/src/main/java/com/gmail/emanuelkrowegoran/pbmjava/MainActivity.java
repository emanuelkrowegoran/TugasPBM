package com.gmail.emanuelkrowegoran.pbmjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] maintitle ={
            "Muhammad. Bilal R","Danis Pangestu",
            "Mikael Dionito Harbigantara","Antonius Jonatan B.W",
            "Danang Triyanto", "M.Nur Ashidiq","Zaqie Alfatah","Mitha Ulum","Adi primanto","Pamungkas"
            ,"Sahril"
    };
    String[] subtitle ={
            "seventee17@gmail.com","danispangestu@gmail.com",
            "mikaeldionitoharbigantara@gmail.com","antonius1398@gmail.com",
            "danang17@gmail.com","mayangsidik@gmail.com",
            "zaqiebot@gmail.com","cahgaming77@gmail.com",
            "adiprimanto@gmail.com","pamungkas@gmail.com",
            "sahrilhasan@gmail.com"
    };
    Integer[] imgid={
            R.drawable.bilal,R.drawable.danis,
            R.drawable.mikael,R.drawable.anton,
            R.drawable.danang,R.drawable.sidik,
            R.drawable.zaqie,R.drawable.ulum,
            R.drawable.masadi,R.drawable.maspam,
            R.drawable.sahril,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listisiview adapter=new listisiview(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
// TODO Auto-generated method stub
                if(position == 0) {
//code specific to first list item
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 1) {
//code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.
                            LENGTH_SHORT).show();
                }
                else if(position == 2) {
                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {
                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 5) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 6) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 7) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 8) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 9) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 10) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
