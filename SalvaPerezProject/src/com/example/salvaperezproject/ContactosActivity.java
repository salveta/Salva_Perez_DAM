package com.example.salvaperezproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ContactosActivity extends Activity {
	
	//creamos el String TAG para ver el ciclo de vida de una app
	private static final String TAG = "Segunda Ventana";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contactos);
		//creamos los botones
		final Button botonValencia = (Button) findViewById(R.id.valencia);
		final Button botonSevilla = (Button) findViewById(R.id.sevilla);
		final Button botonBarcelona = (Button) findViewById(R.id.barcelona);
		final Button botonMadrid = (Button) findViewById(R.id.madrid);
		final Button botonValladolid = (Button) findViewById(R.id.valladolid);
		final Button botonBilbao = (Button) findViewById(R.id.bilbao);
		
		//Le decimos a la función que llama cada botón al hacer click
		botonValencia.setOnClickListener(new devolverLugar());
		botonSevilla.setOnClickListener(new devolverLugar());
		botonBarcelona.setOnClickListener(new devolverLugar());
		botonMadrid.setOnClickListener(new devolverLugar());
		botonValladolid.setOnClickListener(new devolverLugar());
		botonBilbao.setOnClickListener(new devolverLugar());		  
	
		//Se crea el primer paso del ciclo de vida
		Log.i(TAG, "onCreate");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contactos, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	class devolverLugar implements Button.OnClickListener{

		@Override
		public void onClick(View v) {
			//Creamos un botón que llevará los datos del botón que pulsemos
			final Button button = (Button) findViewById(v.getId());			
			//Lanzamos un Intent para devolver los datos
			Intent devolver = new Intent();
			devolver.putExtra("txt", button.getText());
			setResult(RESULT_OK,devolver);
			finish();
			
		}
		
	}
	
	//Resto de estados del ciclo de vida de la app
	@Override
	protected void onStart() {
		super.onStart();
		Log.i(TAG, "onStart");
	}
	@Override
	protected void onResume() {
		super.onResume();
		Log.i(TAG, "onResume");
	}
	@Override
	protected void onPause() {
		super.onPause();
		Log.i(TAG, "onPause");
	}
	@Override
	protected void onStop() {
		super.onStop();
		Log.i(TAG, "onStop");
	}
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.i(TAG, "onRestart");
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "onDestroy");
	}
}
