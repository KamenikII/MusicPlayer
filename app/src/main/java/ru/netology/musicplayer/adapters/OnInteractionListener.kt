package ru.netology.musicplayer.adapters

import ru.netology.musicplayer.dataclasses.Track

interface OnInteractionListener {
    fun onClick(track: Track) {}
}