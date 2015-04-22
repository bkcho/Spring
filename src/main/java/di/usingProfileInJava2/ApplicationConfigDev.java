package di.usingProfileInJava2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import di.usingProfileInJava.ServerInfo;

@Configuration
@Profile("dev")
public class ApplicationConfigDev {
	
	
	@Bean
	public ServerInfo serverInfo(){
		ServerInfo info = new ServerInfo();
		info.setIpNum("localhost");
		info.setPortNum("8181");
		return info;
	}
}