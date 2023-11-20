package com.jamessapplication.app.modules.skintemp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jamessapplication.app.R
import com.jamessapplication.app.databinding.RowSkinTempBinding
import com.jamessapplication.app.modules.skintemp.`data`.model.SkinTempRowModel
import kotlin.Int
import kotlin.collections.List

class SkinTempAdapter(
  var list: List<SkinTempRowModel>
) : RecyclerView.Adapter<SkinTempAdapter.RowSkinTempVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSkinTempVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_skin_temp,parent,false)
    return RowSkinTempVH(view)
  }

  override fun onBindViewHolder(holder: RowSkinTempVH, position: Int) {
    val skinTempRowModel = SkinTempRowModel()
    // TODO uncomment following line after integration with data source
    // val skinTempRowModel = list[position]
    holder.binding.skinTempRowModel = skinTempRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SkinTempRowModel>) {
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
      item: SkinTempRowModel
    ) {
    }
  }

  inner class RowSkinTempVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSkinTempBinding = RowSkinTempBinding.bind(itemView)
  }
}
