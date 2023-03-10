package com.cristian.anasofia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonCalcular: Button = findViewById(R.id.buttonFinal)
        botonCalcular.setOnClickListener{mostrarDatos()}
    }

    private fun mostrarDatos() {
        var campoNombre: EditText = findViewById(R.id.namePerson)
        var nombre: String = campoNombre.text.toString()

        var radio1: RadioButton? = null
        var radio2: RadioButton? = null
        radio1 = findViewById(R.id.radioOne)
        radio2 = findViewById(R.id.radioTwo)

        var cad1: String = ""

        if (radio1?.isChecked == true) {
            cad1 += "Radio Button One\n"
        }
        if (radio2?.isChecked == true) {
            cad1 += "Radio Button Two\n"
        }

        var check1: CheckBox? = null
        var check2: CheckBox? = null

        check1 = findViewById(R.id.checkBoxOne)
        check2 = findViewById(R.id.checkBoxTwo)

        var cad2: String = ""

        if (check1?.isChecked == true) {
            cad2 += "Check Box One\n"
        }
        if (check2?.isChecked == true) {
            cad2 += "Check Box Two\n"
        }

        var buttonToggle: ToggleButton? = null
        buttonToggle = findViewById(R.id.toggleButton)

        var cad: String = ""

        if (buttonToggle?.isChecked == true) {
            cad += "Toggle Button Activo\n"
        } else {
            cad += "Toggle Button Inactivo \n"
        }

        var switch: Switch = findViewById(R.id.switchOff)

        var cad4: String = ""

        if (switch.isChecked) {
            cad4 += "Switch Activo\n"
        } else {
            cad4 += "Switch Inactivo \n"
        }

        var image: ImageButton = findViewById(R.id.imageButton)
        image.setOnClickListener {
            Toast.makeText(this, "Imagen Button ", Toast.LENGTH_LONG).show()
        }
        Toast.makeText(this, "Hola $nombre: \n $cad1 $cad2 $cad $cad4" , Toast.LENGTH_LONG).show()
    }
}