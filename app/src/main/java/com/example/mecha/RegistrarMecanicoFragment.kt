package com.example.mecha

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class RegistrarMecanicoFragment : Fragment(R.layout.regristrar_mecanico_fragment){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cerrarventana = view.findViewById<Button>(R.id.btncerrarregmec)

        cerrarventana.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

    }
}
