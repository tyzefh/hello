package com.evoyageurs.hello;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HelloApplicationTests {

	@Autowired
    private TestRestTemplate restTemplate;

	@Test
    public void hello() {
        ResponseEntity<String> entity = this.restTemplate.getForEntity("/hello",
                String.class);
        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(entity.getBody()).isEqualTo("Salut les stagiaires");
	}
	
	
	@Test
	public void hello_name() {
        ResponseEntity<String> entity = this.restTemplate.getForEntity("/hello?name=Andrej",
				String.class);
        // TODO tester que si on envoie le paramètre "Andrej" on reçoit une réponse OK égale à "Salut Andrej"
	} 

}
