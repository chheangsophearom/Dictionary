package sophearom.com.kh.dictionary

import android.content.Intent
import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import sophearom.com.kh.dictionary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val addWord = findViewById<AppCompatImageView>(R.id.addNewWord)
         recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemViewModel>()
        for (i in 1..20){
            data.add(ItemViewModel( i,"title " + i, "decs "+i))
        }
        val adapter = CustomAdapter(this,data)
        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter
        addWord.setOnClickListener{
            startActivity(Intent(this, AddNewWord::class.java).apply {
                // you can add values(if any) to pass to the next class or avoid using `.apply`
                //putExtra("keyIdentifier", value)
            })
        }

    }
}