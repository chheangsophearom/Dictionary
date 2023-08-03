package sophearom.com.kh.dictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class AddNewWord : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_word)
        val spinner_word_group = findViewById<Spinner>(R.id.spinner_word_group)
        var listWordSpinner = arrayOf("Noun","Verb", "Adj")
        var aa = ArrayAdapter(this,android.R.layout.simple_spinner_item,listWordSpinner)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_word_group.adapter =aa
    }
}