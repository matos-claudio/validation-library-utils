package br.com.claudio.myfirstlibrary

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.claudio.myfirstlibrary.databinding.ActivityMainBinding
import br.com.claudio.validation_utils.Utils

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnValidate.setOnClickListener {
            val cpf = binding.edtCpf.text.toString()
            if(Utils.isValidCPF(cpf)) {
                Toast.makeText(this, "CPF Válido", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "CPF Inválido", Toast.LENGTH_LONG).show()
            }
        }
    }
}