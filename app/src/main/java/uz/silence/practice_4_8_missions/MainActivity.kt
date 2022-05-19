package uz.silence.practice_4_8_missions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.silence.practice_4_8_missions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = Bundle()

        binding.buttonId.setOnClickListener {

            val username = binding.editTextId.text.toString()
            val password = binding.editTextIdTwo.text.toString()
            val passwordT = binding.editTextIdThree.text.toString()



/*            bundle.putString("a",username)
            bundle.putString("b",password)*/

            //val user = User(username, password)

            val contact = Contact(username, mutableListOf(password,passwordT))


            bundle.putSerializable("user", contact)

            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtras(bundle)

            startActivity(intent)

        }

    }
}