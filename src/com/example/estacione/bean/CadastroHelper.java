package com.example.estacione.bean;

import com.example.estacione.CadastroActivity;
import com.example.estacione.R;

import android.widget.EditText;


public class CadastroHelper {

	private EditText nome;
	private EditText email;
	private EditText senha;
	private Usuario usuario;
	
	public CadastroHelper(CadastroActivity activity){
		this.nome = (EditText)activity.findViewById(R.id.edNome);
		this.email = (EditText) activity.findViewById(R.id.edEmail);
		this.senha = (EditText) activity.findViewById(R.id.edSenha);
		this.usuario = new Usuario();
	}
	
	public Usuario getUsuario(){
		usuario.setNome(nome.getText().toString());
		usuario.setEmail(email.getText().toString());
		usuario.setSenha(senha.getText().toString());
		return usuario;
	}
	
	public void setUsuario(Usuario usuario){
		nome.setText(usuario.getNome());
		email.setText(usuario.getEmail());
		senha.setText(usuario.getSenha());
		this.usuario = usuario;
	}
	
}
