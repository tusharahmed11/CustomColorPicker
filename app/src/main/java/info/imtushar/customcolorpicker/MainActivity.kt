package info.imtushar.customcolorpicker

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import info.imtushar.customcolorchooser.ColorPickerDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AppCompatButton>(R.id.open_color_picker).setOnClickListener {
            val colorPickerDialog = ColorPickerDialog.createColorPickerDialog(this)
            colorPickerDialog.setOnColorPickedListener { color, hexVal ->
                Log.d("ColorPicker", "onCreate: $hexVal")
            }

            colorPickerDialog.setHexaDecimalTextColor(Color.parseColor("#000000")) //There are many functions like this
            colorPickerDialog.setSliderThumbColor(Color.parseColor("#ffffff"))
            colorPickerDialog.show();

        }
    }
}