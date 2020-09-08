package ir.wccs.mrsalamat;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    private ViewPager view_pager ;
    private TabLayout tab_layout ;
    private Toolbar toolbar ;
    private ImageView image_menu ;
    private DrawerLayout drawer ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setup_ViewPager();

    }

    private void initViews(){

        view_pager = findViewById(R.id.view_pager);
        tab_layout = findViewById(R.id.tab_layout);
        toolbar = findViewById(R.id.tool_bar);
        image_menu = findViewById(R.id.image_menu);
        drawer = findViewById(R.id.drawer);



        image_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             if (drawer.isDrawerOpen(Gravity.RIGHT)){
                 drawer.closeDrawer(Gravity.RIGHT);
                 return;
             }
                drawer.openDrawer(Gravity.RIGHT);
                return;
            }
        });


    }

    private void setup_ViewPager(){

        BasePagerAdapter basePagerAdapter = new BasePagerAdapter(this,getSupportFragmentManager());
        view_pager.setAdapter(basePagerAdapter);
        tab_layout.setupWithViewPager(view_pager);

    }


}
