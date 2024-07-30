import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {
    ArrayList<Mensagem> listaMensagens = new ArrayList<>();
    ArrayList<String> listaAmigos = new ArrayList<String>();

    public void cadastrarAmigo(String nomeAmigo, String emailAmigo) {
        listaAmigos.add(nomeAmigo);
        listaAmigos.add(emailAmigo);
    }

    public Amigo pesquisaAmigo(String emailAmigo) {
        for (Amigo k : listaAmigos) {
            if (k.getEmail().equals(emailAmigo)) {
                return k;
            }
        }
    }

    public void enviarMensagemParaTodos(String texto , String emailRemetente, boolean ehAnonima){

    }

    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima) {

    }
    public List<Mensagem> pesquisaMensagensAnonimas(){

    }
    public List<Mensagem> pesquisaTodasAsMensagens(){

    }
    public void configurarAmigoSecreto(String emailDaPessoa, String emailAmigoSorteado){

    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa){

    }
}