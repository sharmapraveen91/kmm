//
//  MainViewModel.swift
//  iosApp
//
//  Created by 11009 on 23/06/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import shared

class MainViewModel: ObservableObject {
    @Published var items = [GridItemData]()

    func loadItems() {
        let repository = ItemRepository()
        self.items = repository.getItems()
    }
}
