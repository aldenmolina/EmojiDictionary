package emoji.dictionary

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class EmojiAdapter : RecyclerView.Adapter<EmojiAdapter.TextHolder> {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row, parent, false))
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: EmojiAdapter.TextHolder, position: Int) {
        holder.bindEmoji("\uD83D\uDE04")


    }

    class TextHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        var view : View = v
        var emoji : String = ""

        fun bindEmoji(emoji:String) {
            this.emoji = emoji
            view.itemTextView.text = emoji
        }

        override fun onClick(v: View?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
}