package com.example.salvaperezproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	//creamos el String TAG para ver el ciclo de vida de una app
	private static final String TAG = "Primera Ventana";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Creamos variables para generar las vistas
		final Button boton = (Button) findViewById(R.id.search_button);
		final Button botonContactos = (Button) findViewById(R.id.copy_contacts);
		final EditText typeText = (EditText) findViewById(R.id.type_text);
		
        //Añadimos evento al botón
        boton.setOnClickListener(new Button.OnClickListener(){

				@Override
				public void onClick(View v) {
				//creamos variable para  capturar texto	
				String getTextInTypeText = typeText.getText().toString();
					//creamos la intención para lanzar el mapa
					Intent mapa = new Intent(
							android.content.Intent.ACTION_VIEW,
							Uri.parse("geo:0,0?q= (" + getTextInTypeText + ")")
							);
						startActivity(mapa);		
				}
        }
        );
        
        //Añadimos evento al botónContactos
        botonContactos.setOnClickListener(new Button.OnClickListener(){

				@Override
				public void onClick(View v) {
					//creamos la intención para lanzar la segunda vista
					Intent lanzarVentanContactos = new Intent(
							MainActivity.this,
							ContactosActivity.class
							);
					//Usamos forResult porque esperamos un resultado de la otra actividad
						startActivityForResult(lanzarVentanContactos, 1);		
				}
        }
        );
        	//Se crea el primer paso del ciclo de vida
      		Log.i(TAG, "onCreate");
	}
	
		//Creamos método para recoger los datos de la segunda actividad
		protected void onActivityResult(int requestCode, int resultCode, Intent data) {
			//creamos variable de TextView (la misma que metemos en el boton buscar)
			final TextView comprobado=(TextView) findViewById(R.id.type_text);
			//Hacemos la lógica para que aparezca el string que mandamos de la segunda actividad
		    if (requestCode == 1) {
		        if(resultCode == RESULT_OK){
		            String resultado=data.getStringExtra("txt");
		            comprobado.setText(resultado);
		        }
		        if (resultCode == RESULT_CANCELED) {
		        }
		    }
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
