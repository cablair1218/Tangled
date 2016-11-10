package blair.carina;

import blair.carina.api.AmazonHttpURLConnection;
import blair.carina.api.AmazonRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TangledApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TangledApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		AmazonRequest request = new AmazonRequest();
		AmazonHttpURLConnection http = new AmazonHttpURLConnection();
		try {
			http.sendGet(request.makeRequest("shampoo"));
			http.sendGet(request.makeRequest("conditioner"));

		}catch (Exception e){

		}
	}


}
