//
//  DetailView.swift
//  iosApp
//
//  Created by 11009 on 23/06/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI
import shared

struct DetailView: View {
    let item: GridItemData

    var body: some View {
        VStack {
            Text("Item Details")
                .font(.largeTitle)
                .padding()
            AsyncImage(url: URL(string: item.imageUrl)) { image in
                image.resizable()
                    .aspectRatio(contentMode: .fill)
            } placeholder: {
                Color.gray
            }
            .frame(height: 240)
            .clipped()
            Text(item.description)
                .font(.body)
                .padding()
            Spacer()
        }
        .navigationTitle("Item Details")
        .navigationBarTitleDisplayMode(.inline)
    }
}
