//
//  ContentView.swift
//  AccessibilityTraining
//
//  Created by Max on 12.11.24.
//


import SwiftUI

struct ContentView: View {
    var body: some View {
        NavigationView {
            VStack {
        
                
                Text("Banking App Login")
                    .font(.largeTitle)
                    .padding()
                
                TextField("Benutzername", text: .constant(""))
                    .textFieldStyle(RoundedBorderTextFieldStyle())
                    .padding()
                
                SecureField("Passwort", text: .constant(""))
                    .textFieldStyle(RoundedBorderTextFieldStyle())
                    .padding()
                
                Button("Anmelden") {
                    // Login-Logik hier
                }
                .padding()
                
                NavigationLink(destination: AccountOverviewView()) {
                    Text("Weiter ohne Anmeldung")
                        .foregroundColor(.blue)
                }
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
