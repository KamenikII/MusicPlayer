package ru.netology.musicplayer.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.netology.musicplayer.databinding.MusicItemBinding
import ru.netology.musicplayer.dataclasses.Track

class TrackAdapter(
    private val interactionListener: OnInteractionListener
) : ListAdapter<Track, TrackViewHolder>(TrackDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackViewHolder {
        val binding =
            MusicItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TrackViewHolder(binding, interactionListener)
    }

    override fun onBindViewHolder(holder: TrackViewHolder, position: Int) {
        val track = getItem(position)
        holder.renderingPostStructure(track)
    }
}