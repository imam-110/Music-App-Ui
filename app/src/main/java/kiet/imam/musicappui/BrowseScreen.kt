package kiet.imam.musicappui

import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.grid.GridCells

@Composable
fun BrowseScreen(){
    val categories = listOf("Hits","Happy","Workout","Sad","Yoga","Celebrations")
   LazyVerticalGrid(columns = GridCells.Fixed(2)){
       items(categories){
           cat->
           BrowserItem(cat = cat, drawable = R.drawable.baseline_browse_gallery_24)
       }
   }
}