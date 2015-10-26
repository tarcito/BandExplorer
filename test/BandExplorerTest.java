//import static org.fest.assertions.Assertions.*;

import models.BandExplorer;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tarcito on 23/10/2015.
 */
public class BandExplorerTest {

    BandExplorer classificado;


    @Before
    public void setUp() throws Exception {
        classificado = new BandExplorer();
    }

    //erro ao testar o controller do app BandExplorer, falta configurar o setUp() do BD

    /**

     @Test
    public void deveAdicionarAnuncios() throws Exception {
        String titulo, descricao, cidade, bairro;
        titulo = "banda de jazz"; descricao= "quero encontrar músicos para formar uma banda de jazz";
        cidade = "joão pessoa"; bairro = "manaira";
        boolean  objetivo = true; //"Formar Uma Banda"

        List<String> instrumentos = new ArrayList<String>();
        List<String> estilosQGosta = new ArrayList<String>();
        List<String> estilosQNaoGosta = new ArrayList<String>();
        List<String> formaDeContato = new ArrayList<String>();

        instrumentos.add("flauta");instrumentos.add("trombone");instrumentos.add("trompete");
        estilosQGosta.add("jazz"); instrumentos.add("rock");instrumentos.add("pop");
        estilosQNaoGosta.add("funk"); estilosQNaoGosta.add("rap"); estilosQNaoGosta.add("tecnoMelody");
        formaDeContato.add("franciscopinto@gmail.com");formaDeContato.add("facebook.com/francisco23");
        try{
            classificado.adicionaAnuncio(titulo, descricao, cidade, bairro, instrumentos, estilosQGosta, estilosQNaoGosta, objetivo, formaDeContato);
        } catch (Exception e){
            e.printStackTrace();
        }
        List<String> listaAnunciosString = classificado.getAnunciosToListOfString();

        String anunciosEmStringUnica = listaAnunciosString.toString();

        Assert.assertEquals("Anuncios nao contem descricao", anunciosEmStringUnica.contains(descricao),true);
        Assert.assertEquals("Anuncios nao contem titulo", anunciosEmStringUnica.contains(titulo),true);
        Assert.assertEquals("Anuncios nao contem cidade", anunciosEmStringUnica.contains(cidade),true);
        Assert.assertEquals("Anuncios nao contem bairro", anunciosEmStringUnica.contains(bairro),true);
        Assert.assertEquals("Anuncios nao contem instrumentos", anunciosEmStringUnica.contains(instrumentos.toString()),true);
        Assert.assertEquals("Anuncios nao contem estilosQGosta", anunciosEmStringUnica.contains(estilosQGosta.toString()),true);
        Assert.assertEquals("Anuncios nao contem estilosQNaoGosta", anunciosEmStringUnica.contains(estilosQNaoGosta.toString()),true);
        Assert.assertEquals("Anuncios nao contem formas De Contato)", anunciosEmStringUnica.contains(formaDeContato.toString()),true);
        Assert.assertEquals("Anuncios nao contem objetivo", anunciosEmStringUnica.contains("Formar Uma Banda"),true);

    }

 **/

    @After
    public void tearDown() throws Exception {
    }

}
