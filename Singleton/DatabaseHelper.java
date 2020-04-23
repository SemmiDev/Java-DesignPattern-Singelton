package Singleton;

public class DatabaseHelper{
	private static Connection connection;

	public static Connection getConnection(){
		if(connection == null){
			connection = new connection("localhost","root","");
		}else{
			return connection;
		}
	}
}