package com.tocaboca.tocalifeworlds.gtjtgjgtjigt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tocaboca.tocalifeworlds.R
import com.tocaboca.tocalifeworlds.databinding.FragmentGammmmememem1Binding


class Gammmmememem1Fragment : Fragment() {
    private var fragmentGaammymymyBinding: FragmentGammmmememem1Binding? = null
    private val binding
        get() = fragmentGaammymymyBinding ?: throw RuntimeException("FragmentGammmmememem1Binding = null")


    private val gt5gt5gtgt95gt by lazy {
        listOf(
            binding.imgGameElem1,
            binding.imgGameElem2,
            binding.imgGameElem3,
            binding.imgGameElem4,
            binding.imgGameElem5,
            binding.imgGameElem6,
            binding.imgGameElem7,
            binding.imgGameElem8,
            binding.imgGameElem10,
            binding.imgGameElem11,
            binding.imgGameElem12,
        )
    }

    private fun hyjhyjojhyjihy() {
        gt5gt5gtgt95gt.forEach {
            if (it.visibility == View.VISIBLE) return
        }
        togthgthhgt()
    }

    private fun togthgthhgt() {
        findNavController().navigate(R.id.action_gammmmememem1Fragment_to_gaaaaammmee2Fragment)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaammymymyBinding = FragmentGammmmememem1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    private fun rfhrfhifrrfgtgtgthgtgtgtgthyhyhy() {
        binding.imgGameElem4.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    override fun onDestroy() {
        fragmentGaammymymyBinding = null
        super.onDestroy()
    }

    private fun h26h6hy62hy() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            gtjgtjogtjiogtjiojgti()

            rfhrfhifrrfgtgtgthgtgtgtgthyhyhy()

            hy2hy2hy6()


        } catch (e: Exception) {
            h26h6hy62hy()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun hy2hy2hy6() {
        tgiojgtgtjgtigtj()

        ugtgthgtigthigthgt()

        ijojgtijgtjgtjigt()
    }



    private fun gtjgtjogtjiogtjiojgti() {
        gtigtoihigtji()

        gttggtjgtjjgtjigt()

        ggtjjgtjoigtigtjiogtjigtjiogt()
    }

    private fun gttggtjgtjjgtjigt() {
        binding.imgGameElem2.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }

        binding.imgGameElem3.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    private fun ggtjjgtjoigtigtjiogtjigtjiogt() {
        binding.imgGameElem10.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }

        binding.imgGameElem11.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }

        binding.imgGameElem12.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    private fun ugtgthgtigthigthgt() {
        binding.imgGameElem6.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }

        binding.imgGameElem7.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    private fun ijojgtijgtjgtjigt() {
        binding.imgGameElem8.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    private fun tgiojgtgtjgtigtj() {
        binding.imgGameElem5.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    private fun gtigtoihigtji() {
        binding.imgGameElem1.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }
}