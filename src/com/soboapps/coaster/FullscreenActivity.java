package com.soboapps.coaster;

import java.util.Random;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


@SuppressLint("Recycle")
public class FullscreenActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_fullscreen);

		final View contentView = findViewById(R.id.fullscreen_content);
		TextView textview = (TextView) findViewById(R.id.text_content);
		final Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/brianjames_contour.ttf");
		final ImageView imageview = (ImageView) findViewById(R.id.imageView);
		final ImageView wr = (ImageView) findViewById(R.id.imageView_WR);
		//Resources res = getResources();
		//final TypedArray myImages = res.obtainTypedArray(R.array.myImages);
		//final Random random = new Random();
		
	    //int randomInt = random.nextInt(myImages.length());
	    
		Random generator = new Random();
		int cTextNum;
	    String[] coaster;
	    
		coaster= new String[22];	
			coaster[0]= getString(R.string.stCoaster0);
			coaster[1]= getString(R.string.stCoaster1);
			coaster[2]= getString(R.string.stCoaster2);
			coaster[3]= getString(R.string.stCoaster3);
			coaster[4]= getString(R.string.stCoaster4);
			coaster[5]= getString(R.string.stCoaster5);
			coaster[6]= getString(R.string.stCoaster6);
			coaster[7]= getString(R.string.stCoaster7);
			coaster[8]= getString(R.string.stCoaster8);
			coaster[9]= getString(R.string.stCoaster9);
			coaster[10]= getString(R.string.stCoaster10);
			coaster[11]= getString(R.string.stCoaster11);
			coaster[12]= getString(R.string.stCoaster12);
			coaster[13]= getString(R.string.stCoaster13);
			coaster[14]= getString(R.string.stCoaster14);
			coaster[15]= getString(R.string.stCoaster15);
			coaster[16]= getString(R.string.stCoaster16);
			coaster[17]= getString(R.string.stCoaster17);
			coaster[18]= getString(R.string.stCoaster18);
			coaster[19]= getString(R.string.stCoaster19);
			coaster[20]= getString(R.string.stCoaster20);
			coaster[21]= getString(R.string.stCoaster21);
		
	    
	    //int drawableID = myImages.getResourceId(randomInt, -1);
	    cTextNum=generator.nextInt(22);
	    String coasterText = (coaster[cTextNum]);
	    
	    
		//num=generator.nextInt(57);
		textview.setTypeface(tf);
        textview.setText(coaster[cTextNum]);

		coasterText=textview.getText().toString();
		//l=tvLeft.getText().toString();
		textview.setText(coasterText);
	    
	    
	    
	    //imageview.setBackgroundResource(drawableID);
		

		contentView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				
				wr.setVisibility(View.VISIBLE); 

			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu items for use in the action bar
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu_main, menu);
	    return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.menu_new_coaster:
	        	//startActivity(new Intent("FullscreenActivity"));
	            newCoaster();
	            return true;
	        case R.id.menu_about:
	        	startActivity(new Intent("com.soboapps.coaster.About"));
	            //composeMessage();
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}


	@SuppressLint("Recycle")
	private void newCoaster() {
		
        super.onRestart();
        Intent intent=new Intent();
        intent.setClass(this, this.getClass());
        this.finish();
        this.startActivity(intent);
		 
		//final ImageView imageview = (ImageView) findViewById(R.id.imageView);
		//final ImageView wr = (ImageView) findViewById(R.id.imageView_WR);
		//Resources res = getResources();
		//final TypedArray myImages = res.obtainTypedArray(R.array.myImages);
		//final Random random = new Random();
		
		//wr.setVisibility(View.INVISIBLE);
	    //int randomInt = random.nextInt(myImages.length());
	    //int drawableID = myImages.getResourceId(randomInt, -1);
	    //imageview.setBackgroundResource(drawableID);
		
	}

}
