package com.example.hitepro_app.CustomDialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.hitepro_app.R
import kotlinx.android.synthetic.main.custom_dialog_fragment.*


class CustomDialogFragment : DialogFragment() {

    override fun getTheme() = R.style.RoundedCornersDialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.custom_dialog_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val scriptsActivity = activity

        textСancel.setOnClickListener {
            dialog!!.dismiss()
        }

        textDelete.setOnClickListener{
            Toast.makeText(scriptsActivity, "Это функция пока что не работает", Toast.LENGTH_LONG).show()
            dialog!!.dismiss()
        }
    }

}