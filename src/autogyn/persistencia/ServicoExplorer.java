package autogyn.persistencia;

import java.util.LinkedList;
import java.util.List;

import autogyn.persistencia.ferramentas.ConexaoBD;
import autogyn.persistencia.ferramentas.EasyQuery;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ServicoExplorer {
	private static Connection conn = ConexaoBD.getInstance();
	
	public static List<Servico> getAll() throws SQLException {
        String sql = "select * from servico;";
        List<Servico> servicos = new LinkedList<>();
        ResultSet rs = EasyQuery.exec(conn, sql);
        while(rs.next()) {
            servicos.add(new Servico(rs));
        }
        return servicos;
	}
	
}