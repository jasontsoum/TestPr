package com.example.testpr;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;


public class MainActivity extends Activity {

	Button baton1,buton2;
	enum selection{one,two,three};
	EditText numtext;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		
		
		baton1=(Button)findViewById(R.id.button1);
		baton1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				System.out.println(15 == 9 + 6);
				
			}
		});
		
		buton2=(Button)findViewById(R.id.button2);
		buton2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String string12="teroplis";
			String string15="teroplis";
			int selection_num;
		

			
	if(string12 == string15){
				System.out.println("equal");
				selection sel;
				sel=selection.one;
				System.out.println(sel);
			}
			else
			{
				System.out.println("differnrt");
			}
			
		
			}
		});}
	
	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
			
		return true;
	}

}
