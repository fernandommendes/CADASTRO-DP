package dados;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Funcionario {
	private int mat;
	private String nome;
	private GregorianCalendar admissao;
	private double salario;
	
	private Departamentos depto;
	private Cargo cargo;
	private ArrayList<Dependentes> listaDependentes = new ArrayList<Dependentes>();
	
}
