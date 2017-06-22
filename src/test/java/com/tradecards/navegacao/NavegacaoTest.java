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
		
		$("#Entre").click();
		
		$("#E-mail").fill().with("user1@email.com");
		$("#Senha").fill().with("123");
		$("#Entre").submit();
		assertThat(window().title()).contains("Home");
	}
	
	@Test
	public void cadastroTest(){
		goTo(getUrl("index"));
		assertThat(window().title()).isEqualTo("TradeCards");
		
		$("#Cadastro").click();
		
		$("#Nome").fill().with("Tucano");
		$("#Sobrenome").fill().with("Souza");
		$("#Telefone").fill().with("051975312468");
		$("#E-mail").fill().with("user2@email.com");
		$("#Senha").fill().with("abc");
		$("#Cadastro").submit();
		
	}
	
	@Test
	public void esqueciSenhaTest(){
		goTo(getUrl("index"));
		assertThat(window().title()).isEqualTo("TradeCards");
		
		$("#Entre").click();
		assertThat(window().title()).isEqualTo("Recuperar Senha");
		$("#Recuperar Senha").submit();
		//Esperar dois segundos
		assertThat(window().title()).isEqualTo("Enviar");
	}
	
	/* 
	 * Perfil Usuario 
	 */
	@Test
	public void homeTest(){
		goTo(getUrl("userPerfil"));
		assertThat(window().title()).isEqualTo("Perfil do Usuário");
		
	}
	
	@Test
	public void perfilTest(){
		goTo(getUrl("perfil"));
		assertThat(window().title()).isEqualTo("Meu Perfil");
		$("#Alterar Senha").click();
	}
	
	/* 
	 * Gerenciar Lista de cartas que tenho 
	 */
	@Test
	public void haveListTest(){
		goTo(getUrl("haveList"));
		assertThat(window().title()).isEqualTo("Cartas que Tenho");
		
	}
	
	@Test
	public void addCardInHaveListTest(){
		goTo(getUrl("haveList"));
		$("#Pesquisar").fill().with("Elfo");
		$("#Adicionar").click();
		
	}
	
	@Test
	public void removeCardInHaveListTest(){
		goTo(getUrl("haveList"));
		$("#remove").click();
		
	}
	
	/* 
	 * Gerenciar Lista de cartas que quero 
	 */
	@Test
	public void wantListTest(){
		goTo(getUrl("wantList"));
		assertThat(window().title()).isEqualTo("Cartas que Quero");
		
	}
	
	@Test
	public void addCardInWantListTest(){
		goTo(getUrl("wantList"));
		assertThat(window().title()).isEqualTo("");
		$("#Pesquisar").fill().with("Elfo");
		$("#Adicionar").click();
		
	}
	
	@Test
	public void removeCardInWantListTest(){
		goTo(getUrl("wantList"));
		assertThat(window().title()).isEqualTo("remove");
		
	}
	
	/* 
	 * Buscar Carta 
	 */
	@Test
	public void searchCardTest(){
		goTo(getUrl("searchCard"));
		assertThat(window().title()).isEqualTo("Buscar Carta");
		$("#Buscar").click();
		
	}
	
	/* 
	 * Gerar Relatorio 
	 */
	@Test
	public void generateReportUsersTest(){
		goTo(getUrl("generateReport"));
		assertThat(window().title()).isEqualTo("Gerar Relatórios");
		$("#Usuários").click();
		$("#Gerar PDF").click();
		
	}
	
	@Test
	public void generateReportCardsTest(){
		goTo(getUrl("generateReport"));
		assertThat(window().title()).isEqualTo("Gerar Relatórios");
		$("#Cartas").click();
		$("#Gerar PDF").click();
		
	}
	
	/* 
	 * Desativar Usuario 
	 */
	@Test
	public void disableAccountUserTest(){
		goTo(getUrl("searchUsers"));
		assertThat(window().title()).isEqualTo("Buscar Usuário");
		$("#Buscar Usuario").fill().with("Elfo");
		$("#Buscar").submit();
		
	}
	
	/* 
	 * Gerenciar Cartas 
	 */
	@Test
	public void manageCardsTest(){
		goTo(getUrl("manageCards"));
		assertThat(window().title()).isEqualTo("");
		
	}
	
	@Test
	public void addCardTest(){
		goTo(getUrl("manageCards"));
		assertThat(window().title()).isEqualTo("");
		$("#Criar").click();
		
		$("#Nome").fill().with("Elfo");
		$("#Edicao").fill().with("2017");
		$("#Cadastrar").submit();
	}
	
	@Test
	public void editCardTest(){
		goTo(getUrl("manageCards"));
		assertThat(window().title()).isEqualTo("");
		$("#Buscar").click();
		
		$("#Pesquisar").fill().with("Elfo");
		$("#edit").click();
	}
	
	@Test
	public void deleteCardTest(){
		goTo(getUrl("manageCards"));
		assertThat(window().title()).isEqualTo("");
		$("#Buscar").click();
		
		$("#Pesquisar").fill().with("Elfo");
		$("#delete").click();
	}
	
}
