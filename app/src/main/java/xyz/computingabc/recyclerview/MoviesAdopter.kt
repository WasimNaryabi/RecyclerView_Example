package xyz.computingabc.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_movie.view.*

class MoviesAdopte(val movies:List<Movie>) :RecyclerView.Adapter<MoviesAdopte.MovieViewHolder>() {

    // This funtion is used for attach layout to adopter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_movie,parent,false)
        )
    }

    // This funtion is used for finding size of list
    override fun getItemCount()=movies.size

    // This funtion is used for binding the data
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie= movies[position]

        holder.view.textViewTitle.text = movie.title
        holder.view.textViewLanguage.text = movie.language
        holder.view.textViewType.text = movie.type
        holder.view.textViewRating.text = movie.rating
        holder.view.textViewLikePercent.text = movie.likePercent.toString() + "%"
        holder.view.textViewVotesCount.text = movie.voteCount.toString() + " votes"
        holder.view.textViewIsNew.visibility = if(movie.isNew) View.VISIBLE else View.INVISIBLE
    }


    class MovieViewHolder(val view: View):RecyclerView.ViewHolder(view)
}