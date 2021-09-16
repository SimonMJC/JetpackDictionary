package com.glwona.jepackexample.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.glwona.jepackexample.R
import com.glwona.jepackexample.databinding.MainFragmentBinding
import com.glwona.jepackexample.BR.myViewModel

class MainFragment : Fragment() {
//    private var _binding: MainFragmentBinding? = null
//    private val binding get() = _binding!!
lateinit var binding: MainFragmentBinding
    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        _binding = MainFragmentBinding.inflate(inflater, container, false)
        binding = DataBindingUtil.inflate(
            inflater, R.layout.main_fragment, container, false
        )
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.setVariable(myViewModel, viewModel)
//        binding.resultText.text = viewModel.getResult().toString()

  /*      val resultObserver = Observer<Float>{
            result -> binding.resultText.text = result.toString()
        }
        viewModel.getResult().observe(viewLifecycleOwner, resultObserver)
        binding.convertButton.setOnClickListener {
            if(binding.dollarText.text.isNotEmpty()){
                viewModel.setAmount(binding.dollarText.text.toString())
//                binding.resultText.text = viewModel.getResult().toString()
            }else{
                binding.resultText.text = "No Value"
            }
        }*/
    }

}