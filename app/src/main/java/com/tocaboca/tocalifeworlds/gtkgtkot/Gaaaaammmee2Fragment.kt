package com.tocaboca.tocalifeworlds.gtkgtkot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tocaboca.tocalifeworlds.R
import com.tocaboca.tocalifeworlds.databinding.FragmentGaaaaammmee2Binding


class Gaaaaammmee2Fragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            gtjogtjigtjiogtjiogtjoigt()


        } catch (e: Exception) {
            vfvvf()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtjogtjigtjiogtjiogtjoigt() {
        rffrfrrfhuirfhrf()

        gtjogtjogtjiogtijo()

        gjogtigtijgtjigt()
    }

    private fun gjogtigtijgtjigt() {
        binding.dovn.setOnClickListener {
            gtjgtigtigtgtgt()
            findNavController().navigate(R.id.action_gaaaaammmee2Fragment_to_gammmmememem1Fragment)
        }
    }

    private fun gtjogtjogtjiogtijo() {
        binding.center.setOnClickListener {
            gtjgtigtigtgtgt()
            findNavController().navigate(R.id.action_gaaaaammmee2Fragment_to_gammmmememem1Fragment)
        }
    }

    private fun rffrfrrfhuirfhrf() {
        binding.top.setOnClickListener {
            gtjgtigtigtgtgt()
            findNavController().navigate(R.id.action_gaaaaammmee2Fragment_to_gammmmememem1Fragment)
        }
    }

    private fun gtjgtigtigtgtgt() {
        Toast.makeText(requireContext(), "Done. Reloading game...", Toast.LENGTH_SHORT).show()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaaaammmee2Binding =
            FragmentGaaaaammmee2Binding.inflate(inflater, container, false)
        return binding.root
    }


    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentGaaaaammmee2Binding: FragmentGaaaaammmee2Binding? = null
    private val binding
        get() = fragmentGaaaaammmee2Binding
            ?: throw RuntimeException("FragmentGaaaaammmee2Binding = null")


    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGaaaaammmee2Binding = null
        super.onDestroy()
    }
}