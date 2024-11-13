package at.interactivecuriosity.accessibilitytrainingxml

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton: Button = findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            // Weiterleitung zur Kontenübersicht
            val intent = Intent(this, AccountOverviewActivity::class.java)
            startActivity(intent)
        }
    }
}