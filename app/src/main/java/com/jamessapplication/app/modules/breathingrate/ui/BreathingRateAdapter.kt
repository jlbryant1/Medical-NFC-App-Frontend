package com.jamessapplication.app.modules.breathingrate.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jamessapplication.app.R
import com.jamessapplication.app.databinding.RowBreathingRateBinding
import com.jamessapplication.app.modules.breathingrate.`data`.model.BreathingRateRowModel
import kotlin.Int
import kotlin.collections.List

class BreathingRateAdapter(
  var list: List<BreathingRateRowModel>
) : RecyclerView.Adapter<BreathingRateAdapter.RowBreathingRateVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBreathingRateVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_breathing_rate,parent,false)
    return RowBreathingRateVH(view)
  }

  override fun onBindViewHolder(holder: RowBreathingRateVH, position: Int) {
    val breathingRateRowModel = BreathingRateRowModel()
    // TODO uncomment following line after integration with data source
    // val breathingRateRowModel = list[position]
    holder.binding.breathingRateRowModel = breathingRateRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BreathingRateRowModel>) {
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
      item: BreathingRateRowModel
    ) {
    }
  }

  inner class RowBreathingRateVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBreathingRateBinding = RowBreathingRateBinding.bind(itemView)
  }
}
