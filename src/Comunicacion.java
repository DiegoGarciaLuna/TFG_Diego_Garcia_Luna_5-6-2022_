import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Comunicacion {
	private static Connection  conn;
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "Valdemorillo";
	private static final String url = "jdbc:mysql://localhost:3306/prestigioportales";
	
	
	
	public void Conectar() {
		
		conn=null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
			//	System.out.println("Conexión establecida");
			}
			
			
			
		}catch(ClassNotFoundException | SQLException e) {
			
			System.out.println("Error al conectar" + e);
			
		}
	}
	
	
	
	
	
	
	public Connection getConection() {
		return conn;
	}
	
	public void desconectar() {
		conn = null;
		if(conn==null) {
			//System.out.println("Conexion terminada");
		}
	}
	
	
	
	
	
	
	
	public int portales(String id) {
		
		float aux1=0;
		int aux2=1;

		String aux3="";
		try {
			
		Statement ps;
		ResultSet res;
		
	    ps=conn.createStatement();
	    res= ps.executeQuery("SELECT * FROM prestigioportales.comunicacion");
	 
	    while(res.next()){

	    	aux3=res.getString(2);
			
			if(id.contains(aux3)) { 
				 
				aux1=res.getInt(3);
				aux2= (int)Math.round(aux1);
				break;
			 }

		}

	 
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return aux2;
	}
	

}
