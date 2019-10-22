package com.haobi.navigationviewdemo;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private Button button;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DrawerLayout实例
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        //NavigationView实例
        navigationView = (NavigationView)findViewById(R.id.nav_view) ;
        //设置默认选项
        navigationView.setCheckedItem(R.id.nav_call);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.nav_call:
                        //可加入额外操作
                        Toast.makeText(MainActivity.this,"Call",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_email:
                        //可加入额外操作
                        Toast.makeText(MainActivity.this,"E-mail",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_location:
                        //可加入额外操作
                        Toast.makeText(MainActivity.this,"Location",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_tasks:
                        //可加入额外操作
                        Toast.makeText(MainActivity.this,"Tasks",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                }
                return true;
            }
        });
        //Button实例
        button = (Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //调用DrawerLayour的openDrawer()方法将滑动菜单展示出来
                mDrawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }
}
