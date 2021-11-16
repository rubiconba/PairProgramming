package ba.rubicon.pairprogramming.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ba.rubicon.pairprogramming.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
    }
}