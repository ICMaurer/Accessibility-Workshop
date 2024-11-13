package at.interactivecuriosity.accessiblitytrainingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BankingApp()
        }
    }
}

@Composable
fun BankingApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("accountOverview") { AccountOverviewScreen(navController) }
        composable("transfer") { TransferScreen() }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Banking App Login") }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Banking App Login",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            var username by remember { mutableStateOf("") }
            TextField(
                value = username,
                onValueChange = { username = it },
                label = { Text("Benutzername") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            var password by remember { mutableStateOf("") }
            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Passwort") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { /* Login Logic here */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Anmelden")
            }
            Spacer(modifier = Modifier.height(16.dp))

            TextButton(onClick = { navController.navigate("accountOverview") }) {
                Text("Weiter ohne Anmeldung", color = Color.Blue)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AccountOverviewScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Kontenübersicht") }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = "Kontenübersicht",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text("Girokonto - 1.234,56 €", modifier = Modifier.padding(8.dp))
            Text("Sparkonto - 10.345,78 €", modifier = Modifier.padding(8.dp))
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { navController.navigate("transfer") },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)
            ) {
                Text("Überweisung", color = Color.White)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TransferScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Neue Überweisung") }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp)
        ) {

            Text(
                text = "Neue Überweisung",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Button(
                onClick = { /* Handle click */ },
                modifier = Modifier.size(48.dp)
            ) {
                Text("Großer Button")
            }
            var recipient by remember { mutableStateOf("") }
            TextField(
                value = recipient,
                onValueChange = { recipient = it },
                label = { Text("Empfängername") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            var iban by remember { mutableStateOf("") }
            TextField(
                value = iban,
                onValueChange = { iban = it },
                label = { Text("IBAN") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            var amount by remember { mutableStateOf("") }
            TextField(
                value = amount,
                onValueChange = { amount = it },
                label = { Text("Betrag") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { /* Confirm Transfer Logic here */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)
            ) {
                Text("Bestätigen", color = Color.White)
            }
        }
    }
}