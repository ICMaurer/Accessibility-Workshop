//
//  AccountOverviewView.swift
//  AccessibilityTraining
//
//  Created by Max on 12.11.24.
//

import SwiftUI

struct AccountOverviewView: View {
    var body: some View {
        VStack {
            Text("Kontenübersicht")
                .font(.title)
                .padding()
            
            List {
                Text("Girokonto - 1.234,56 €")
                Text("Sparkonto - 10.345,78 €")
            }
            
            NavigationLink(destination: TransferView()) {
                Text("Überweisung")
                    .padding()
                    .foregroundColor(.white)
                    .background(Color.blue)
                    .cornerRadius(10)
            }
        }
    }
}

struct AccountOverviewView_Previews: PreviewProvider {
    static var previews: some View {
        AccountOverviewView()
    }
}
