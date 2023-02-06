import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Identificacion {
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
				//System.out.println("Conexión establecida");
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
		//	System.out.println("Conexion terminada");
		}
	}
	
	
	
	
	
	
	public String portales(String id) {
		String aux1="";
		String aux2 ="";
		
		try {
			
		Statement ps;
		ResultSet res;
		
	  ps=conn.createStatement();
	  res= ps.executeQuery("SELECT * FROM prestigioportales.iddatosgob");
	 while(res.next()){
		 
		
		 aux1=res.getString(1);

		if(aux1.contains(id)) {
		 aux2=res.getString("datosgob");	
		 }

	   }

	
      } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return aux2;
		 
	}
	

}
