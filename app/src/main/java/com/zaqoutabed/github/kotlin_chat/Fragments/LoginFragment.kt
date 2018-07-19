package com.zaqoutabed.github.kotlin_chat.Fragments

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import com.fourhcode.forhutils.FUtilsValidation
import com.zaqoutabed.github.kotlin_chat.Activities.HomeActivity

import com.zaqoutabed.github.kotlin_chat.R
import com.zaqoutabed.github.kotlin_chat.R.string.login
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var loadingProgressBar: ProgressBar

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view:View =  inflater.inflate(R.layout.fragment_login, container, false)

        emailEditText = view.findViewById(R.id.emailEditText)
        passwordEditText = view.findViewById(R.id.passwordEditText)
        loginButton = view.findViewById(R.id.loginButton)
        loadingProgressBar = view.findViewById(R.id.loadingProgressBar)

        loginButton.setOnClickListener {
            if (!FUtilsValidation.isEmpty(emailEditText, "Required Field") &&
                    FUtilsValidation.isValidEmail(emailEditText, "Enter Valid Email")&&
                    !FUtilsValidation.isEmpty(passwordEditText, "Required Field")){
                if (passwordEditText.text.toString().length < 6)
                    passwordEditText.error = "Password less than 6 characters"
                else{
                    login(emailEditText.text.toString(), passwordEditText.text.toString())
                }
            }
        }

        return view
    }

    private fun login(email:String, password:String){
        val intent: Intent = Intent(activity, HomeActivity::class.java)
        startActivity(intent)
        activity!!.finish()
    }
}
