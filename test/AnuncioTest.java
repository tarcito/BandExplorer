/**
 * Created by Tarcito on 23/10/2015.
 */

//import static org.fest.assertions.Assertions.*;

import models.Anuncio;
import org.junit.*;
import org.junit.Assert;


import java.util.ArrayList;
import java.util.List;



public class AnuncioTest {

    Anuncio anuncio;

    String titulo, descrição, cidade, bairro;
    boolean objetivo;
    List<String> instrumentos = new ArrayList<String>();
    List<String> estilosQGosta = new ArrayList<String>();
    List<String> estilosQNaoGosta = new ArrayList<String>();
    List<String> formaDeContato = new ArrayList<String>();

    @Before
    public void setUp() throws Exception {

        anuncio = new Anuncio();
    }
    @Test

    public void devePermitirCriarAnuncio() throws Exception{

        titulo = "banda de jazz"; descrição= "quero encontrar companheiros músicos para formar uma banda de rock";
        cidade = "joão pessoa"; bairro = "manaira"; objetivo = true;
        instrumentos.add("guitarra");instrumentos.add("violão");instrumentos.add("baixo");
        estilosQGosta.add("jazz"); instrumentos.add("rock");instrumentos.add("pop");
        estilosQNaoGosta.add("funk"); estilosQNaoGosta.add("rap"); estilosQNaoGosta.add("tecnoMelody");
        formaDeContato.add("franciscopinto@gmail.com");formaDeContato.add("facebook.com/francisco23");
        try {
            anuncio.setTitulo(titulo);
            anuncio.setDescricao(descrição);
            anuncio.setBairro(bairro);
            anuncio.setCidade(cidade);
            anuncio.setInstrumentos(instrumentos);
            anuncio.setEstilosQGosta(estilosQGosta);
            anuncio.setEstilosQNaoGosta(estilosQNaoGosta);
            anuncio.setObjetivo(objetivo);
            anuncio.setFormaDeContato(formaDeContato);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals("titulo nao correspondente",anuncio.getTitulo().equals(titulo),true);
        Assert.assertEquals("descricao nao correspondente",anuncio.getDescricao().equals(descrição), true);
        Assert.assertEquals("cidade nao correspondente",anuncio.getCidade().equals(cidade), true);
        Assert.assertEquals("bairro nao correspondente",anuncio.getBairro().equals(bairro), true);
        Assert.assertEquals("instrumentos nao correspondentes", anuncio.getInstrumentos().equals(instrumentos), true);
        Assert.assertEquals("estilosQGosta nao correspondentes", anuncio.getEstilosQGosta().equals(estilosQGosta), true);
        Assert.assertEquals("estilosQNaoGosta nao correspondentes", anuncio.getEstilosQNaoGosta().equals(estilosQNaoGosta), true);
        Assert.assertEquals("formas de contato nao correspondentes",anuncio.getFormaDeContato().equals(formaDeContato),true);
        Assert.assertEquals("objetivo nao correspondente",anuncio.getObjetivo().equals("Formar Uma Banda"), true);
    }

    @Test
    public void deveRetornarObjetivoCorreto(){
        anuncio.setObjetivo(true);
        Assert.assertEquals("objetivo retornado deveria ser -Formar Uma Banda-",anuncio.getObjetivo(),"Formar Uma Banda");
        anuncio.setObjetivo(false);
        Assert.assertEquals("objetivo retornado deveria ser -Tocar Ocasionalmente-",anuncio.getObjetivo(),"Tocar Ocasionalmente");
    }

    @Test
    public void naoDevePemitirTituloVazioOuNulo()throws Exception {
        try {
            anuncio.setTitulo("");
        } catch (Exception e) {
            Assert.assertEquals("Titulo vazio!", e.getMessage());
        }

        try {
            anuncio.setTitulo(null);
        } catch (Exception e) {
            Assert.assertEquals("Titulo nulo!", e.getMessage());
        }
    }

    @Test
    public void naoDevePermitirDescricaoVaziaOuNula(){
        try {
            anuncio.setDescricao("");
        } catch (Exception e) {
            Assert.assertEquals("Descricao vazia!", e.getMessage());
        }

        try {
            anuncio.setDescricao(null);
        } catch (Exception e) {
            Assert.assertEquals("Descricao nula!", e.getMessage());
        }

    }

    @Test
    public void naoDevePermitirCidadeVaziaOuNula(){
        try {
            anuncio.setCidade("");
        } catch (Exception e) {
            Assert.assertEquals("Cidade vazia!", e.getMessage());
        }

        try {
            anuncio.setCidade(null);
        } catch (Exception e) {
            Assert.assertEquals("Cidade nula!", e.getMessage());
        }
    }

    @Test
    public void naoDevePermitirBairroVazioOuNulo(){
        try {
            anuncio.setBairro("");
        } catch (Exception e) {
            Assert.assertEquals("Bairro vazio!", e.getMessage());
        }

        try {
            anuncio.setBairro(null);
        } catch (Exception e) {
            Assert.assertEquals("Bairro nulo!", e.getMessage());
        }
    }

    @Test
    public void naoDevePermitirInstrumentosVazioOuNulo(){
        try {
            anuncio.setInstrumentos(new ArrayList<String>());
        } catch (Exception e) {
            Assert.assertEquals("Lista dos instrumentos vazia!", e.getMessage());
        }

        try {
            anuncio.setInstrumentos(null);
        } catch (Exception e) {
            Assert.assertEquals("Lista dos instrumentos nula!", e.getMessage());
        }
    }


}
