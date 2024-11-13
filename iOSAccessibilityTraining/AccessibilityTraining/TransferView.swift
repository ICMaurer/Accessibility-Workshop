//
//  TransferView.swift
//  AccessibilityTraining
//
//  Created by Max on 12.11.24.
//

import SwiftUI

struct TransferView: View {
    var body: some View {
        VStack {
            Text("Neue Überweisung")
                .font(.title)
                .padding()
            
            TextField("Empfängername", text: .constant(""))
                .textFieldStyle(RoundedBorderTextFieldStyle())
                .padding()
            
            TextField("IBAN", text: .constant(""))
                .textFieldStyle(RoundedBorderTextFieldStyle())
                .padding()
            
            TextField("Betrag", text: .constant(""))
                .textFieldStyle(RoundedBorderTextFieldStyle())
                .padding()
            
            Button("Bestätigen") {
                // Überweisung bestätigen Logik hier
            }
            .padding()
            .foregroundColor(.white)
            .background(Color.blue)
            .cornerRadius(10)
        }
    }
}

struct TransferView_Previews: PreviewProvider {
    static var previews: some View {
        TransferView()
    }
}
