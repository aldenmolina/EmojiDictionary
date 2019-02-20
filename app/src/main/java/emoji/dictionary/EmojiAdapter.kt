package emoji.dictionary

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class EmojiAdapter : RecyclerView.Adapter<EmojiAdapter.TextHolder> {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): TextHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(p0: TextHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class TextHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        override fun onClick(v: View?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
}