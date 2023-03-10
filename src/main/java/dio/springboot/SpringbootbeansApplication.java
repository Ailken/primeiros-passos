package dio.springboot;

import com.google.gson.Gson;
import dio.springboot.app.ConversorJson;
import dio.springboot.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootbeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootbeansApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"53433020\",\"logradouro\":\"República Árabe Unida\",\"localidade\":\"Pernambuco\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do Cep: " + response);
		};
	}
	/*@Bean
	public Gson gson(){
		return new Gson();
	}
*/
}
