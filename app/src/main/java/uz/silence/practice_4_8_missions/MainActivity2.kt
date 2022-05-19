package uz.silence.practice_4_8_missions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.silence.practice_4_8_missions.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val extras = intent.extras

        val user = extras?.getSerializable("user") as Contact

/*        val a = extras?.getString("a")
        val b = extras?.getString("b")*/

        binding.textViewBundle.text = "${user.ContactName} \n ${user.ContactNumber}"

    }
}