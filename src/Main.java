import dao.EngenheiroDAO;
import dao.OperarioDAO;
import dao.ProjetoDAO;
import entities.Engenheiro;
import entities.Operario;
import entities.Projeto;

public class Main {
    public static void main(String[] args) {

        Projeto projeto = new Projeto();
        ProjetoDAO daoProjeto = new ProjetoDAO();

        Engenheiro engenheiro = new Engenheiro();
        EngenheiroDAO daoEngenheiro = new EngenheiroDAO();

        Operario operario = new Operario();
        OperarioDAO daoOperario = new OperarioDAO();

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

        // ==================
        System.out.println();

        // Inserir engenheiro
//        engenheiro.setNome("");
//        engenheiro.setEspecialidade("");
//        daoEngenheiro.inserir(engenheiro);

        // Atualizar engenheiro
//        engenheiro.setNome("");
//        engenheiro.setEspecialidade("");
//        engenheiro.setId();
//        daoEngenheiro.atualizar(engenheiro);

        // Excluir engenheiro
//        engenheiro.setId();
//        daoEngenheiro.excluir(engenheiro);

        // Listar engenheiro
        for(Engenheiro e : daoEngenheiro.listar()){
            System.out.println(e);
        }

        // ==================
        System.out.println();

        // Inserir Operario
//        operario.setNome("");
//        operario.setFuncao("");
//        daoOperario.inserir(operario);

        // Atualizar operario
//        operario.setNome("");
//        operario.setFuncao("");
//        operario.setId();
//        daoOperario.atualizar(operario);

        // Excluir operario
//        operario.setId();
//        daoOperario.excluir(operario);

        // Listar operario
        for(Operario o : daoOperario.listar()){
            System.out.println(o);
        }

        // ==================
        System.out.println();

        // Listar equipamento
    }
}
