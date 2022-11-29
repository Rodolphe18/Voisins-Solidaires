package com.francotte.voisinssolidaires.ui

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.francotte.voisinssolidaires.R
import com.francotte.voisinssolidaires.databinding.NeighbourItemBinding
import com.francotte.voisinssolidaires.model.Neighbour

class NeighbourRecyclerView(val neighbours : List<Neighbour>, val context : Context, val glide: Glide) : RecyclerView.Adapter<NeighbourRecyclerView.ViewHolder>(){

    class NeighbourViewHolder(val binding: NeighbourItemBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NeighbourViewHolder {
        return NeighbourViewHolder(
            NeighbourItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: NeighbourViewHolder, position: Int) {
        val neighbour: Neighbour = neighbours[position]


        holder.binding.itemListName.text = neighbour.name


        Glide.with(holder.binding.itemListAvatar.context)
            .load(neighbour.avatarUrl)
            .apply(RequestOptions.circleCropTransform())
            .into(holder.binding.itemListAvatar)

        holder.binding.itemListDeleteButton.setOnClickListener {
            EventBus.getDefault().post(DeleteNeighbourEvent(neighbour, 0))
        }

        holder.binding.itemListLayout.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, DetailNeighbourActivity::class.java)
            intent.putExtra("position", position)
            context.startActivity(intent)
        })
    }

    override fun getItemCount(): Int {
        return neighbours.size
    }


}

