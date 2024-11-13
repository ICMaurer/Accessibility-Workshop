package at.interactivecuriosity.accessibilitytrainingxml

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class TransferActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transfer)

        val confirmButton: Button = findViewById(R.id.confirm_button)
        confirmButton.setOnClickListener {
            val recipientName: EditText = findViewById(R.id.recipient_name)
            val iban: EditText = findViewById(R.id.iban)
            val amount: EditText = findViewById(R.id.amount)

            // Überweisung bestätigen - hier könnte Logik für die Überweisung eingefügt werden
            Toast.makeText(this, "Überweisung an ${recipientName.text} erfolgreich!", Toast.LENGTH_SHORT).show()
        }
    }
}