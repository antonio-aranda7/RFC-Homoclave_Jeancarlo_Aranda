package mx.edu.itechetumal.rfc_homoclave_jeancarloaranda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.util.Collections.shuffle
import kotlin.math.log10

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ////////////////
        var respuesta = findViewById<TextView>(R.id.textViewRFC)
        var txtName = findViewById<EditText>(R.id.txtNombre);
        var txtPaterno = findViewById<EditText>(R.id.txtPaterno);
        var txtMaterno = findViewById<EditText>(R.id.txtMaterno);
        var txtDate = findViewById<EditText>(R.id.txtFecha);
        var btnGenerar = findViewById<Button>(R.id.btnGenerar);
        var btnLimpiar = findViewById<Button>(R.id.btnLimpiar);


        val nombre = txtName.text.toString()
        val paterno = txtPaterno.text.toString()
        val materno = txtMaterno.text.toString()
        val date = txtDate.text.toString()

        val homoclave: MutableList<String> = mutableListOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z")
        val homoclave2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

        btnGenerar.setOnClickListener {

            var rfcNombre = nombre[0].toString()
            var rfcPaterno = paterno[0].toString()
            var rfcPaterno2 = paterno[1].toString()
            var rfcMaterno = materno[0].toString()
            var rfcDate = date[2].toString()
            var rfcDate2 = date[3].toString()
            var rfcHomoclave = homoclave.random()
            var rfcHomoclave2 = homoclave.random()
            var rfcHomoclave3 = homoclave2.random()

            respuesta.text = rfcPaterno + rfcPaterno2 + rfcNombre + rfcDate + rfcDate2 + rfcHomoclave + rfcHomoclave2 + rfcHomoclave3;

        }

        btnLimpiar.setOnClickListener {
            var clearrespuesta = findViewById<TextView>(R.id.textViewRFC)
            var cleartxtName = findViewById<EditText>(R.id.txtNombre);
            var cleartxtPaterno = findViewById<EditText>(R.id.txtPaterno);
        }
    }
}
                                