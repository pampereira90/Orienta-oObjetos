public class Aluno{

private String matricula;
private String nome;
private String curso;

public void setMatricula(String matricula){
    this.matricula = matricula;
}

public void setNome(String nome){
    this.nome = nome;
}

public void setCurso(String curso){
    this.curso = curso;
}


public vois listar(){
    System.out.println(toString());
}
@override
public String toString(){
    return "Aluno [curso=" + curso + ", matricula=" + matricula + ", nome=" + nome + "]";
}



}