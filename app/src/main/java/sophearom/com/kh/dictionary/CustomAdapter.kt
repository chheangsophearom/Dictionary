package sophearom.com.kh.dictionary

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import sophearom.com.kh.dictionary.databinding.ItemViewBinding

class CustomAdapter( val context:Context, val mList:List<ItemViewModel>):
    RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    private var onClickListener: OnClickListener? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(
          LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemViewModel = mList[position]

        holder.mTextView.text = ItemViewModel.text
        holder.mTextView.setOnClickListener {
            Toast.makeText(context, "position" + position, Toast.LENGTH_SHORT).show()
        }

    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun listen(getMyAdapterPos: (Int, Int) -> Unit): CustomAdapter.ViewHolder {
            itemView.setOnClickListener {
                getMyAdapterPos(getAdapterPosition(), getItemViewType())
            }
            return this
        }

        val mTextView: TextView = itemView.findViewById(R.id.recy_text)


    }

    override fun getItemCount(): Int {
        return mList.size
    }



}