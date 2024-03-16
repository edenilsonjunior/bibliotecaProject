package controller;

import model.dao.emprestimo.EmprestimoDao;
import model.dao.emprestimo.EmprestimoDaoImpl;
import model.dao.livro.LivroDao;
import model.dao.livro.LivroDaoImpl;
import model.dao.user.UsuarioDao;
import model.dao.user.UsuarioDaoImpl;

public class SystemController {

    private UsuarioDao usuarios;
    private EmprestimoDao emprestimos;
    private LivroDao livros;

    public SystemController() {
        usuarios = UsuarioDaoImpl.getInstance();
        livros = LivroDaoImpl.getInstance();
        emprestimos = EmprestimoDaoImpl.getInstance();
    }


    public void run(){
        // TODO

//        MenuOption escolha;

//        do {
//            escolha = SistemaView.menu();
//
//
//            switch (escolha){
//                case CADASTRAR_LIVRO:
//                    break;
//                case CADASTRAR_USUARIO:
//                    //
//                    break;
//                case LISTAR_LIVROS:
//
//                    break;
//                case LISTAR_USUARIO_COM_EMPRESTIMO:
//
//                    break;
//                case LISTAR_EMPRESTIMOS_ATRASADOS:
//
//                    break;
//                case LISTAR_LIVROS_EMPRESTADOS:
//
//                    break;
//                case LISTAR_USUARIO_COM_PENALIDADE:
//            }
//
//
//        } while(escolha != MenuOption.SAIR);

    }
}