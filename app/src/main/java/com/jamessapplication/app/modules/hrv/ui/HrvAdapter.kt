package com.jamessapplication.app.modules.hrv.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jamessapplication.app.R
import com.jamessapplication.app.databinding.RowHrvBinding
import com.jamessapplication.app.modules.hrv.`data`.model.HrvRowModel
import kotlin.Int
import kotlin.collections.List

class HrvAdapter(
  var list: List<HrvRowModel>
) : RecyclerView.Adapter<HrvAdapter.RowHrvVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHrvVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_hrv,parent,false)
    return RowHrvVH(view)
  }

  override fun onBindViewHolder(holder: RowHrvVH, position: Int) {
    val hrvRowModel = HrvRowModel()
    // TODO uncomment following line after integration with data source
    // val hrvRowModel = list[position]
    holder.binding.hrvRowModel = hrvRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HrvRowModel>) {
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
      item: HrvRowModel
    ) {
    }
  }

  inner class RowHrvVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHrvBinding = RowHrvBinding.bind(itemView)
  }
}
