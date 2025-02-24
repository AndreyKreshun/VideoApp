package com.example.youtubevideo

data class YouTubeSearchResponse(
    val items: List<YouTubeVideoItem>
)

data class YouTubeVideoItem(
    val id: VideoId,
    val snippet: VideoSnippet
)

data class VideoId(val videoId: String)

data class VideoSnippet(
    val title: String,
    val thumbnails: Thumbnails
)

data class Thumbnails(val medium: Thumbnail)

data class Thumbnail(val url: String)
