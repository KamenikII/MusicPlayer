package ru.netology.musicplayer.dataclasses

data class Track(
    val id: Int,
    val file: String,
    var duration: String? = "",
    var isPlaying: Boolean = false,
)
