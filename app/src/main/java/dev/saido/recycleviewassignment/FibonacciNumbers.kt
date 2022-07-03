package dev.saido.recycleviewassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FibonacciNumbers(var numbers:List<Int>):RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.fibonacci_list_item, parent, false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumbers.text=numbers.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numbers.size
    }
}

class NumbersViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvNumbers = itemView.findViewById<TextView>(R.id.tvNumbers)

}