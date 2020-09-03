package com.example.sachinrajput.foodappadmin;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class FragmentActivity extends AppCompatActivity {
      Button additem;
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        additem=(Button)findViewById(R.id.additembtn);


     // frameLayout =(FrameLayout)findViewById(R.id.fram1);

        additem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = null;


                fragment=new AddItemFragment();

                if ((fragment != null)) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fram1, fragment);
                    fragmentTransaction.commit();
                    // set the toolbar title
                  //  getSupportActionBar().setTitle(title);
                }


            }
        });
    }
}
