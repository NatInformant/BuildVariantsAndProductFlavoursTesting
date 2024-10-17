package com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.R
import com.example.healthypetsadvisor.buildvariantsandproductflavourstesting.databinding.FragmentMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : Fragment(R.layout.fragment_main) {

    private val binding: FragmentMainBinding by viewBinding()
    private val viewModel: MainViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.userInfo.observe(viewLifecycleOwner) {
            binding.userInfo.text = it
        }
    }
}
