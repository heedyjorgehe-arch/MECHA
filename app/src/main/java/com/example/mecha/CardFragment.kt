package com.example.mecha

import android.widget.Button
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mecha.R

class CardFragment : Fragment(R.layout.item_card) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Aquí va tu lógica del fragment

         val btnregmec = view.findViewById<Button>(R.id.btnRegistrarMecanico)
        val btnregcond = view.findViewById<Button>(R.id.btnRegistrarConductor)
        val btncerrar = view.findViewById<Button>(R.id.btncerrar)

        btncerrar.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        btnregmec.setOnClickListener {
            val regmecfragment = RegistrarMecanicoFragment()
            parentFragmentManager.beginTransaction()
                .replace(R.id.contenedorFragments, regmecfragment)
                .addToBackStack(null)
                .commit()
        }

        btnregcond.setOnClickListener {
            val regcondfragment = RegistrarConductorFragment()
            parentFragmentManager.beginTransaction()
                .replace(R.id.contenedorFragments, regcondfragment)
                .addToBackStack(null)
                .commit()
        }

    }
}
