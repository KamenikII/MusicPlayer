package ru.netology.musicplayer.adapters

import androidx.recyclerview.widget.RecyclerView
import ru.netology.musicplayer.databinding.MusicItemBinding
import ru.netology.musicplayer.R
import ru.netology.musicplayer.dataclasses.Track

class TrackViewHolder(
    private val binding: MusicItemBinding,
    private val interactionListener: OnInteractionListener,
) : RecyclerView.ViewHolder(binding.root) {

    fun renderingPostStructure(track: Track) {
        with(binding) {
            trackName.text = track.file
            playItem.setImageResource(
                if (track.isPlaying) {
                    R.drawable.ic_pause_circle
                } else {
                    R.drawable.ic_play_circle
                }
            )
            trackTime.text = track.duration ?: ""
            soundListeners(track)
        }
    }

    private fun soundListeners(track: Track) {
        with(binding) {
            playItem.setOnClickListener {
                interactionListener.onClick(track)
            }
        }
    }
}