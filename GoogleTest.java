package automatizado.test;

import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import automatizado.Page.GooglePO;

public class GoogleTest extends BaseTest { // Conectar a Base de testes, irá acessar se não estiverem privados.
   
    private static GooglePO googlePage; 

    @BeforeClass 
    public static void prepararTestes(){
        driver.get("https://www.google.com/");
        googlePage = new GooglePO(driver);
    }

    @org.junit.Test
    public void TC001_deveSerPossivelPesquisarNoGoogleOTextoBatataFrita(){
        
        googlePage.pesquisar("Batata frita"); //Meu teste sabe pesquisar

        String resultado = googlePage.obterResultadoDaPesquisa(); //Sabe obter o resultado

        assertTrue(resultado, resultado.contains("Aproximadamente")); //E sabe testar
     }

    @org.junit.Test
    public void TC002_deveSerPossivelPesquisarNoGoogleOTextoNutella(){

        googlePage.pesquisar("Nutella");
        
        String resultado = googlePage.obterResultadoDaPesquisa();

        assertTrue(resultado, resultado.contains("resultados"));

    }
}