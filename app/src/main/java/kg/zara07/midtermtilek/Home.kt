package kg.zara07.midtermtilek

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val prevBtn : Button = view.findViewById(R.id.explore)
        prevBtn.setOnClickListener{
            val fragment = Explore()
            val transition = fragmentManager?. beginTransaction()
            transition?.replace(R.id.navigation, fragment)?.commit()

        }
        return view
    }
}

