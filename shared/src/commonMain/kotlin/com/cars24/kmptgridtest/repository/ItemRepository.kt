package com.cars24.kmptgridtest.repository

import com.cars24.kmptgridtest.GridItemData


/**
 * Created by Praveen.Sharma on 22/06/24 - 11:00..
 *
 ***/
class ItemRepository {

    fun getItems(): List<GridItemData> {
        return listOf(
            GridItemData(id= 1, imageUrl = "https://picsum.photos/id/101/200/300", description =  "1. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed malesuada feugiat ligula, sed consectetur dolor eleifend id. Integer id fermentum arcu."),
            GridItemData(id= 2, imageUrl = "https://picsum.photos/id/102/200/300", description =  "2. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed malesuada feugiat ligula, sed consectetur dolor eleifend id. Integer id fermentum arcu."),
            GridItemData(id= 3, imageUrl = "https://picsum.photos/id/12/200/300", description =  "3. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed malesuada feugiat ligula, sed consectetur dolor eleifend id. Integer id fermentum arcu."),
            GridItemData(id= 4, imageUrl = "https://picsum.photos/id/13/200/300", description =  "4. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed malesuada feugiat ligula, sed consectetur dolor eleifend id. Integer id fermentum arcu."),
            GridItemData(id= 5, imageUrl = "https://picsum.photos/id/14/200/300", description =  "5. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed malesuada feugiat ligula, sed consectetur dolor eleifend id. Integer id fermentum arcu."),
            GridItemData(id= 6, imageUrl = "https://picsum.photos/id/15/200/300", description =  "6. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed malesuada feugiat ligula, sed consectetur dolor eleifend id. Integer id fermentum arcu."),
            GridItemData(id= 7, imageUrl = "https://picsum.photos/id/17/200/300", description =  "7. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed malesuada feugiat ligula, sed consectetur dolor eleifend id. Integer id fermentum arcu."),
            GridItemData(id= 8, imageUrl = "https://picsum.photos/id/18/200/300", description =  "8. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed malesuada feugiat ligula, sed consectetur dolor eleifend id. Integer id fermentum arcu."),
            GridItemData(id= 9, imageUrl = "https://picsum.photos/id/19/200/300", description =  "9. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed malesuada feugiat ligula, sed consectetur dolor eleifend id. Integer id fermentum arcu."),
            GridItemData(id= 10, imageUrl = "https://picsum.photos/id/20/200/300", description =  "10. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed malesuada feugiat ligula, sed consectetur dolor eleifend id. Integer id fermentum arcu."))
    }
}