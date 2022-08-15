 package calle.lara.teo.dccomics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

 class RegistroSuperHeroeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_super_heroe)

        //Creo una instancia de la clase button y la asocio al boton que se creó en la interfaz
        val btnRegister : Button = findViewById(R.id.btn_register)
        val etNombre : EditText = findViewById(R.id.etHeroName)
        val tvInfo : TextView = findViewById(R.id.tv_info)

        /*
        *Quiero que lo que escriba en el EditText se vea en el TextView cuando haga clic sobre el
        * boton
        * */
        btnRegister.setOnClickListener {
           // val nombre = etNombre.text //Esto es lo mismo que en java nombre = etNombre.getText()
           // tvInfo.text = nombre //Esto es lo mismo que en java tvInfo.setText(nombre)

            tvInfo.text = etNombre.text // Esto hace lo mismo que las 2 instrucciones anteriores

            //Si quisiera almacenar la info en una base de datos solo sería llamar el método y ponerle
            //la data que quiero enviar cuando haga click

        }
    }
}