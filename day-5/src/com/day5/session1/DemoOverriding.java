package com.day5.session1;
class Connection{	
}
class MySqlConnection extends Connection{
	
}

class OracleConnection extends Connection{
	
}

class ConnFactory{
	
	public Connection getConnection() {
		return null;
	}
}
class MySqlConnFactory extends ConnFactory{
	@Override
	public MySqlConnection getConnection() {
		return null;
	}
}
public class DemoOverriding {

	public static void main(String[] args) {
	
	
	}
}
