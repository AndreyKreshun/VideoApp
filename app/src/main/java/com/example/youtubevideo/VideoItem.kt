package com.example.youtubevideo

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun VideoItem(video: YouTubeVideoItem, onVideoClick: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onVideoClick(video.id.videoId) }
    ) {
        AsyncImage(
            model = video.snippet.thumbnails.medium.url,
            contentDescription = video.snippet.title,
            modifier = Modifier.fillMaxWidth().height(180.dp)
        )
        Text(text = video.snippet.title, fontSize = 16.sp, fontWeight = FontWeight.Bold)
    }
}
