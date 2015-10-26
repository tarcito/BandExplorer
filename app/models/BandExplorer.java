package models;

import models.dao.GenericDAO;
import play.db.jpa.Transactional;

import java.util.*;

/**
 * Created by Tarcito on 25/05/2015.
 */
public class BandExplorer {

    private GenericDAO daoAnuncios  = new GenericDAO();

   public BandExplorer(){

   }

    @Transactional
    public void adicionaAnuncio(String titulo, String descricao, String cidade, String bairro, List<String> instrumentos, List<String> estilosQGosta, List<String> estilosQNaoGosta, boolean objetivo, List<String> formaDeContato) throws Exception {
        Anuncio novoAnuncio = new Anuncio(titulo, descricao, cidade, bairro, instrumentos, estilosQGosta, estilosQNaoGosta, objetivo, formaDeContato);
        daoAnuncios.persist(novoAnuncio);
        daoAnuncios.flush();
    }

    @Transactional
    public List<Anuncio> getAnuncios() {
        List<Anuncio> anuncios = daoAnuncios.findAllByClassName(Anuncio.class.getName());
        Collections.sort(anuncios);
        return anuncios;
    }
    @Transactional
    public List<String> getAnunciosToListOfString(){
        List<String> listaResposta = new ArrayList<String>();
        List<Anuncio> listaDosAnuncios = getAnuncios();
        for (Anuncio  anuncio: listaDosAnuncios){
            listaResposta.add(anuncio.toString());
        }
        return listaResposta;
    }

    @Transactional
    public long getNumerodeAnuncios(){
        return getAnuncios().size();
    }
}
