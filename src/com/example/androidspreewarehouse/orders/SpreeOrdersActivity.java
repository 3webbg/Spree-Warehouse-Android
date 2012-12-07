package com.example.androidspreewarehouse.orders;

import com.example.androidspreewarehouse.R;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class SpreeOrdersActivity extends FragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spree_fragment_holder);
		
		if (findViewById(R.id.fragment_container) != null) {

            if (savedInstanceState != null) {
                return;
            }
            
            //TODO: add initial fragment
            
		}
		
		
	}
	
}
