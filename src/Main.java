import dao.ProjetoDAO;
import entities.Projeto;

public class Main {
    public static void main(String[] args) {

        Projeto projeto = new Projeto();
        ProjetoDAO daoProjeto = new ProjetoDAO();

        // Inserir projeto
//        projeto.setNome("");
//        projeto.setLocal("");
//        projeto.setDataInicio("");
//        projeto.setDataTermino("");
//        daoProjeto.inserir(projeto);

        // Atualizar projeto
//        projeto.setId();
//        projeto.setNome("");
//        projeto.setLocal("");
//        projeto.setDataInicio("");
//        projeto.setDataTermino("");
//        daoProjeto.atualizar(projeto);

        // Excluir projeto
//        projeto.setId();
//        daoProjeto.excluir(projeto);

        // Listar projeto
        for(Projeto p : daoProjeto.listar()){
            System.out.println(p);
        }


    }
}
