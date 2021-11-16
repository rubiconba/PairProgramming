package ba.rubicon.pairprogramming.presentation.landing

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import ba.rubicon.pairprogramming.R
import ba.rubicon.pairprogramming.domain.entity.Repository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LandingFragment : Fragment(R.layout.landing) {

    @Inject
    lateinit var mAdapter: LandingAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = mAdapter
        mAdapter.submitList(dummyList())
    }

    private fun dummyList(): List<Repository> {
        return listOf(
            Repository("Title 1", "Subtitle 1"),
            Repository("Title 2", "Subtitle 2"),
            Repository("Title 3", "Subtitle 3"),
            Repository("Title 4", "Subtitle 4"),
            Repository("Title 5", "Subtitle 5"),
            Repository("Title 6", "Subtitle 6"),
        )
    }
}