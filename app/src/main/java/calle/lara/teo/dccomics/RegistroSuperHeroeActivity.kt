 package calle.lara.teo.dccomics

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

 class RegistroSuperHeroeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_super_heroe)

        //Creo una instancia de la clase button y la asocio al boton que se creó en la interfaz
        val btnRegister : Button = findViewById(R.id.btn_register)
        val etNombre: EditText = findViewById(R.id.etHeroName)
        val tvInfo : TextView = findViewById(R.id.tv_info)
        val tietEstatura : TextInputEditText = findViewById(R.id.tiet_estatura)
        val rbMasculino : RadioButton = findViewById(R.id.rb_masculino)
       // val rbFemenino : RadioButton = findViewById(R.id.rb_femenino)
        val cboxFuerza : CheckBox = findViewById(R.id.cbox_super_fuerza)
        val cboxSpeed : CheckBox = findViewById(R.id.cbox_speed)
        val cboxTelepatia : CheckBox = findViewById(R.id.cbox_telepatia)
        val spnrCiudades : Spinner = findViewById(R.id.spnr_ciudad_nacimiento)


        /*
        *Quiero que lo que escriba en el EditText se vea en el TextView cuando haga clic sobre el
        * boton
        * */
        btnRegister.setOnClickListener {
           // val nombre = etNombre.text //Esto es lo mismo que en java nombre = etNombre.getText()
           // tvInfo.text = nombre //Esto es lo mismo que en java tvInfo.setText(nombre)

            val genero : String = if (rbMasculino.isChecked)
                getString(R.string.masculino)
            else getString(R.string.femenino)

            var poderes = ""

            val ciudadDeNacimiento = spnrCiudades.selectedItem.toString()

            if(cboxFuerza.isChecked) poderes = getString(R.string.super_strength)
            if(cboxSpeed.isChecked) poderes = poderes+" "+getString(R.string.speed)
            if(cboxTelepatia.isChecked) poderes = poderes+" "+getString(R.string.telepatia)

            tvInfo.text = getString(R.string.info,etNombre.text.toString(),tietEstatura.text.toString().toFloat(), genero, poderes, ciudadDeNacimiento) // Esto hace lo mismo que las 2 instrucciones anteriores
            /**Arriba se ve el uso de un placeholder*/

            //val string:Float = tietEstatura.text.toString().toFloat()

            //Si quisiera almacenar la info en una base de datos solo sería llamar el método y ponerle
            //la data que quiero enviar cuando haga click



        }
    }
}