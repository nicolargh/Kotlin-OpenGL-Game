package com.example.nicolargh.opengltest.ui.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.nicolargh.opengltest.R

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setUpViewModel()
        setUpClickListeners()
    }

    private fun setUpViewModel() {
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.liveData.observe(this, Observer {
            handleEvent(it)
        })
    }

    private fun setUpClickListeners() {
        view?.findViewById<Button>(R.id.start)?.setOnClickListener {
            viewModel.handleStartClicked()
        }
    }

    private fun handleEvent(event: MainViewEvent?) {
        when(event) {
            is MainViewEvent.StartPressed -> start()
        }
    }

    private fun start() {
        Log.d(TAG, "starting!")
    }

    companion object {
        private const val TAG = "MainFragment"
    }
}
