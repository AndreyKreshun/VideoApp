package com.example.youtubevideo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    var videos by mutableStateOf<List<YouTubeVideoItem>>(emptyList())
    private val apiService = RetrofitClient.apiService

    fun searchVideos(query: String) {
        viewModelScope.launch {
            val response = apiService.searchVideos(query = query, apiKey = "AIzaSyCd7ARaSXlD_LFQ2lnATla45hi1JjCnORE")
            if (response.isSuccessful) {
                videos = response.body()?.items ?: emptyList()
            }
        }
    }
}
