package testServicos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsultaCEPTest {
    String url = "http://viacep.com.br/ws/";
    @Test
    public void validaStatusCode(){
        //http://viacep.com.br/ws/{{CEP}}/json/
        String cep = "04055041";
        String endpoint = cep.concat("/json/");

        RestUtils.setEndpoint(endpoint);
        RestUtils.setUrl(url);

        RestUtils.get();
        assertEquals(200, RestUtils.getStatusCode());

    }

}
