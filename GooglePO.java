package automatizado.Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "result-stats")
    public WebElement divResultadoPesquisa;
    /**
     * Construtor para criação da página do google
     * @param driver Driver da página do google.
     */

    public GooglePO(WebDriver driver) {
        super(driver);
    }
    
    /**
     * Metodo que irá efetuar uma pesquisa no google baseando no texto informado e concluindo com ENTER.
     * @param texto Texto a ser pesquisado
     */
    public void pesquisar(String texto){
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    /**
     * Metodo que retorna o resultado aproximado da pesquisa.
     * @return Retorna o resultado da pesquisa.
     */
    public String obterResultadoDaPesquisa(){
    return divResultadoPesquisa.getText();
    }
}
