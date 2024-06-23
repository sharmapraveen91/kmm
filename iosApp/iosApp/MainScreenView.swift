//
//  MainScreenView.swift
//  iosApp
//
//  Created by 11009 on 23/06/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI
import shared

struct MainView: View {
    @StateObject private var viewModel = MainViewModel()

    var body: some View {
        NavigationView {
            ScrollView {
                LazyVGrid(columns: [GridItem(), GridItem()], spacing: 16) {
                    ForEach(viewModel.items, id: \.id) { item in
                        NavigationLink(destination: DetailView(item: item)) {
                            GridItemView(item: item)
                        }
                    }
                }
                .padding()
            }
            .navigationTitle("Items")
        }
        .onAppear {
            viewModel.loadItems()
        }
    }
}

struct GridItemView: View {
    let item: GridItemData

    var body: some View {
        VStack {
            AsyncImage(url: URL(string: item.imageUrl)) { image in
                image.resizable()
                    .aspectRatio(contentMode: .fill)
                    
            } placeholder: {
                Color.gray
            }
            .frame(height: 240)
            .clipped()
            .clipShape(.rect(cornerRadius:8))
            Text(item.description_)
                .font(.body)
                .padding()
            Spacer()
        }
    }
}

#Preview {
    MainView()
}
