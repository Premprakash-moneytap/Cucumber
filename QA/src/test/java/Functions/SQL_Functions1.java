package Functions;

import java.sql.SQLException;
import java.util.Properties;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class SQL_Functions1 
{
	public void Create_connection() throws ClassNotFoundException, SQLException
	{
	String user = "techadminacct";
    String password = "cashin2oo8$";
    String host = "devpg001-mumbai.claxidzirf9s.ap-south-1.rds.amazonaws.com";
    int port=5432;
    try
        {
        JSch jsch = new JSch();
        Session session = jsch.getSession(user, host, port);
        int  lport = 5432;
        String rhost = "13.126.179.1";
        int rport = 22;
        session.setPassword(password);
        
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        
        session.setConfig("StrictHostKeyChecking", "no");
        System.out.println("Establishing Connection...");
        session.connect();
        session.setTimeout(3000000);
        int assinged_port=session.setPortForwardingL(lport, rhost, rport);
        System.out.println("localhost:"+assinged_port+" -> "+rhost+":"+rport);
        
        }
    catch(Exception e){System.err.print(e);}
}

}
