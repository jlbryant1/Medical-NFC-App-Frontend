package com.jamessapplication.app.modules.spotwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jamessapplication.app.R
import com.jamessapplication.app.databinding.RowSpotwoBinding
import com.jamessapplication.app.modules.spotwo.`data`.model.SpotwoRowModel
import kotlin.Int
import kotlin.collections.List

class SpotwoAdapter(
  var list: List<SpotwoRowModel>
) : RecyclerView.Adapter<SpotwoAdapter.RowSpotwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSpotwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_spotwo,parent,false)
    return RowSpotwoVH(view)
  }

  override fun onBindViewHolder(holder: RowSpotwoVH, position: Int) {
    val spotwoRowModel = SpotwoRowModel()
    // TODO uncomment following line after integration with data source
    // val spotwoRowModel = list[position]
    holder.binding.spotwoRowModel = spotwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SpotwoRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: SpotwoRowModel
    ) {
    }
  }

  inner class RowSpotwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSpotwoBinding = RowSpotwoBinding.bind(itemView)
  }
}
