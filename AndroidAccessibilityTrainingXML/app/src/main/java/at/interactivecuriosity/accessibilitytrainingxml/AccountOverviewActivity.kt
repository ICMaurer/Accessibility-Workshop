package at.interactivecuriosity.accessibilitytrainingxml

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ListView
import android.widget.ArrayAdapter

class AccountOverviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account_overview)

        // Dummy-Daten für die Kontenübersicht
        val accountsListView: ListView = findViewById(R.id.accounts_list)
        val accounts = arrayOf("Girokonto - 1.234,56 €", "Sparkonto - 10.345,78 €")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, accounts)
        accountsListView.adapter = adapter

        val transferButton: Button = findViewById(R.id.transfer_button)
        transferButton.setOnClickListener {
            // Weiterleitung zum Überweisung-Screen
            val intent = Intent(this, TransferActivity::class.java)
            startActivity(intent)
        }
    }
}