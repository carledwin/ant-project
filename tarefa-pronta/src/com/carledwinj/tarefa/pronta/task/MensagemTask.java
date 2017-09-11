package com.carledwinj.tarefa.pronta.task;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class MensagemTask extends Task {

	private String texto;
	private int prioridade;

	@Override
	public void execute() throws BuildException {
		//System.out.println("Executed MensagemTask by Ant!");
		
		if(prioridade > 2) {
			System.out.println(texto);
		}
	}
	
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	/*metodo chamado automaticamente pelo ant quando encontra conteudo no corpo da tag*/
	public void addText(String texto) {
		this.texto = texto == null ? "" : texto.trim();
	}
}
