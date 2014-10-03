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
		
		//incorporamos el evento al boton
		botonValencia.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent devolucionDatos = new Intent();
				//En el Intent enviamos la información a la primera ventana
				devolucionDatos.putExtra("txt", "Valencia");
				setResult(RESULT_OK,devolucionDatos);
				finish();
			}
    	}   
	
		);
		
		//incorporamos el evento al boton
		botonValladolid.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent devolucionDatos = new Intent();
				//En el Intent enviamos la información a la primera ventana
				devolucionDatos.putExtra("txt", "Valladolid");
				setResult(RESULT_OK,devolucionDatos);
				finish();
			}
    	}   
		);
		
		//incorporamos el evento al boton
		botonMadrid.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent devolucionDatos = new Intent();
				//En el Intent enviamos la información a la primera ventana
				devolucionDatos.putExtra("txt", "Madrid");
				setResult(RESULT_OK,devolucionDatos);
				finish();
			}
    	}   
		);
		
		//incorporamos el evento al boton
		botonBarcelona.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent devolucionDatos = new Intent();
				//En el Intent enviamos la información a la primera ventana
				devolucionDatos.putExtra("txt", "Barcelona");
				setResult(RESULT_OK,devolucionDatos);
				finish();
			}
    	}   
		);
		//incorporamos el evento al boton
		botonBilbao.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent devolucionDatos = new Intent();
				//En el Intent enviamos la información a la primera ventana
				devolucionDatos.putExtra("txt", "Bilbao");
				setResult(RESULT_OK,devolucionDatos);
				finish();
			}
    	}   
		);
		
		//incorporamos el evento al boton
		botonSevilla.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent devolucionDatos = new Intent();
				//En el Intent enviamos la información a la primera ventana
				devolucionDatos.putExtra("txt", "Sevilla");
				setResult(RESULT_OK,devolucionDatos);
				finish();
			}
    	}   
		);
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
