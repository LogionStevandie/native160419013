package id.ac.ubaya.informatika.native160419013

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var nama:String = "Logion"
    private var phone:String = "123123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Welcome to Android $nama", Toast.LENGTH_SHORT).show()

    }
}