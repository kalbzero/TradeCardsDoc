package com.tradecards.navegacao;

import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@Wait
public class NavegacaoTest extends FluentTest{

	@Value("${local.server.port}")
	int port;

	String getUrl(String file) {
		return "http://localhost:" + port + "/prototype/" + file + ".html";
	}
	
	/* Index */
	@Test
	public void loginTest() {
		goTo(getUrl("index"));
		assertThat(window().title()).isEqualTo("TradeCards");
		
		$("#email").fill().with("user");
		$("#senha").fill().with("senha");
		$("#entrar").submit();
		assertThat(window().title()).contains("");
	}
	
	@Test
	public void cadastroTest(){
		
	}
	
	@Test
	public void esqueciSenhaTest(){
		
	}
	
	/* 
	 * Perfil Usuario 
	 */
	@Test
	public void homeTest(){
		
	}
	
	@Test
	public void perfilTest(){
		
	}
	
	/* 
	 * Gerenciar Lista de cartas que tenho 
	 */
	@Test
	public void haveListTest(){
		
	}
	
	@Test
	public void addCardInHaveListTest(){
		
	}
	
	@Test
	public void removeCardInHaveListTest(){
		
	}
	
	/* 
	 * Gerenciar Lista de cartas que quero 
	 */
	@Test
	public void wantListTest(){
		
	}
	
	@Test
	public void addCardInWantListTest(){
		
	}
	
	@Test
	public void removeCardInWantListTest(){
		
	}
	
	/* 
	 * Buscar Carta 
	 */
	@Test
	public void searchCardTest(){
		
	}
	
	/* 
	 * Gerar Relatorio 
	 */
	@Test
	public void generateReportUsersTest(){
		
	}
	
	@Test
	public void generateReportCardsTest(){
		
	}
	
	/* 
	 * Desativar Usuario 
	 */
	@Test
	public void disableAccountUserTest(){
		
	}
	
	/* 
	 * Gerenciar Cartas 
	 */
	@Test
	public void manageCardsTest(){
		
	}
	
	@Test
	public void addCardTest(){
		
	}
	
	@Test
	public void editCardTest(){
		
	}
	
	@Test
	public void deleteCardTest(){
		
	}
	
}
