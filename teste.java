/*import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

class Lista {
    questao05[] array = new questao05[60];
    int n;

    Lista() {
        
    }

    public Lista(questao05[] array, int n) {
        this.array = array;
        this.n = n;
    }

    public questao05[] getArray() {
        return array;
    }

    public void setArray(questao05[] array) {
        this.array = array;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void inserirInicio(questao05 x) throws Exception{
        if(n >= array.length) {
            throw new Exception("ERRO");
        }

        for(int i = n; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = x;
        n++;
    }

    public void inserirFim(questao05 x) throws Exception{
        if(n >= array.length) {
            throw new Exception("ERRO");
        }

        array[n] = x;
        n++;
    }

    public void inserir (questao05 x, int posicao) throws Exception{
        if(n >= array.length || posicao < 0 || posicao > n) {
            throw new Exception("ERRO");
        }

        for(int i = n; i > posicao; i--) {
            array[i] = array[i - 1];
        }

        array[posicao] = x;
        n++;
    }

    public questao05 removerInicio() throws Exception{
        if(n == 0) {
            throw new Exception("ERRO");
        }

        questao05 resp = array[0];
        n--;

        for(int i = 0; i < n; i++) {
            array[i] = array[i + 1];
        }

        return resp;
    }

    public questao05 removerFim() throws Exception{
        if(n == 0) {
            throw new Exception("ERRO");
        }

        return array[--n];
    }

    public questao05 remover (int posicao) throws Exception {
        if(n == 0 || posicao < 0 || posicao >= n) {
            throw new Exception("ERRO");
        }

        questao05 resp = array[posicao];
        n--;

        for(int i = posicao; i < n; i++) {
            array[i] = array[i + 1];
        }

        return resp;
    }

    public void mostrar() {
        System.out.print("[");
        for(int i = 0; i < n; i++) {
            System.out.printf(array[i] + " ");
        }
        System.out.print("]");
    }

}

public class teste {
    private int app_id;
    private String nome;
    private String release_date;
    private String owners;
    private int age;
    private float price;
    private int dlcs;
    private String[] languages;
    private String website;
    private Boolean windows;
    private Boolean mac;
    private Boolean linux;
    private float upvotes;
    private int avg_pt;
    private String developers;
    private String[] genres;

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReleaseDate() {
        String mes ="";
        String ano ="";
        String data ="";

        mes = mes + release_date.charAt(0)+release_date.charAt(1)+release_date.charAt(2);
        ano = ano + release_date.charAt(release_date.length()-4)+release_date.charAt(release_date.length()-3)+release_date.charAt(release_date.length()-2)+release_date.charAt(release_date.length()-1);

        data = data + mes + "/" + ano;
        this.release_date = data;

        return this.release_date;
    }
    public void setReleaseDate(String release_date) {
        this.release_date = release_date;
    }

    public String getOwners() {
        return owners;
    }
    public void setOwners(String owners) {
        this.owners = owners;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public int getDlcs() {
        return dlcs;
    }
    public void setDlcs(int dlcs) {
        this.dlcs = dlcs;
    }

    public String[] getLanguages() {
        return languages;
    }
    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean getWindows() {
        return windows;
    }
    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public boolean getMac() {
        return mac;
    }
    public void setMac (boolean mac) {
        this.mac = mac;
    }

    public boolean getLinux() {
        return linux;
    }
    public void setLinux(boolean linux) {
        this.linux = linux;
    }

    public float getUpvotes() {
        return upvotes;
    }
    public void setUpvotes(float upvotes) {
        this.upvotes = upvotes;
    }

    public int getAvg_pt() {
        return avg_pt;
    }
    public void setAvg_pt(int avg_pt) {
        this.avg_pt = avg_pt;
    }

    public String getDevelopers() {
        return developers;
    }
    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public String[] getGenres() {
        return genres;
    }
    public void setGenres (String[] genres) {
        this.genres = genres;
    }

    public teste() {

    }

    public teste(int app_id, String nome, String release_date, String owners, int age, float price, int dlcs, String[] languages, String website, Boolean windows, Boolean mac, Boolean linux, float upvotes, int avg_pt, String developers, String[] genres) {
        this.app_id = app_id;
        this.nome = nome;
        this.release_date = release_date;
        this.owners = owners;
        this.age = age;
        this.price = price;
        this.dlcs = dlcs;
        this.languages = languages;
        this.website = website;
        this.windows = windows;
        this.mac = mac;
        this.linux = linux;
        this. upvotes = upvotes;
        this.avg_pt = avg_pt;
        this.developers = developers;
        this.genres = genres;
    }

    public void StringParse(String linha, String id) {
        String categoria = "";
        int virgulas = linha.indexOf(',');

        for (int i = 0; i < virgulas; i++) {
            categoria = categoria + linha.charAt(i);
        }

        if (categoria.equals(id)) {

            String[] array = linha.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            setApp_id(Integer.parseInt(array[0]));
            setNome(array[1]);
            setReleaseDate(array[2].replaceAll("\"", ""));
            setOwners(array[3]);
            setAge(Integer.parseInt(array[4]));
            setPrice(Float.parseFloat(array[5]));
            setDlcs(Integer.parseInt(array[6]));
            setLanguages(array[7].replaceAll("'", "").replaceAll("\"", "").split(","));
            setWebsite(array[8]);
            setWindows(Boolean.parseBoolean(array[9]));
            setMac(Boolean.parseBoolean(array[10]));
            setLinux(Boolean.parseBoolean(array[11]));
            setUpvotes(Float.parseFloat(array[12]) / (Float.parseFloat(array[12]) + (Float.parseFloat(array[13]))));
            setAvg_pt(Integer.parseInt(array[14]));
            setDevelopers(array[15].replaceAll("\"", ""));
            setGenres(array[16].replaceAll("\"", "").split(","));
            imprimir();
        }
    }

    public void imprimir() {
        System.out.print (getApp_id() + " " + getNome() + " " + getReleaseDate() + " " + getOwners() + " " + getAge() + " ");
        DecimalFormat novo = new DecimalFormat("0.00");
        System.out.print(novo.format(getPrice()) + " ");
        System.out.print(getDlcs() + " ");
        for(int i = 0; i < getLanguages().length - 1; i++) {
            System.out.print(getLanguages()[i] + ", ");
        }
        System.out.print(getLanguages()[getLanguages().length - 1] + " " + getWebsite() + " " + getWindows() + " " + getMac()
        + " " + getLinux() + " "
        + ((int)Math.round(getUpvotes() * 100)) + "% "
        + (int)(getAvg_pt() / 60) + "h " + (getAvg_pt() % 60) + "m ");
        System.out.print(getDevelopers() + " " + "[");
        for(int i = 0; i < getGenres().length - 1; i++) {
            System.out.print(getGenres()[i] + ", ");
        }
        System.out.print(getGenres()[getGenres().length - 1] + "]");
        System.out.print("\n");
    }

    public void ler(String frase) throws IOException, ParseException {
        Scanner arquivo = new Scanner(new File("games.csv"));
        String[] linha = new String[4403];

        int n = 0;
        while (arquivo.hasNext()) {
            linha[n] = arquivo.nextLine();
            StringParse(linha[n], frase);
            n++;
        }
    }

    static Boolean isFim(String palavra) {
        boolean result = false;
        if (palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') {
            result = true;
        }
        return result;
    }

    public static void main (String[] args) {
        Scanner arquivo = new Scanner(System.in);
        String aux = "";
        Lista lista = new Lista();
        int x = 0;

        aux = arquivo.nextLine();
        while(isFim(aux) == false) {
            lista[x] = aux;
            aux = arquivo.nextLine();
            x++;
        }
        aux = arquivo.nextLine();
        int n = Integer.parseInt(aux);
        aux = arquivo.nextLine();
        if(aux.charAt(0) == 'I' && aux.charAt(1) == 'I') {
            String ID = "";
            int id = 0;
            String[] array = aux.split(" ");
            ID = array[1];
            id = Integer.parseInt(ID);

            lista.inserirInicio(id);
        }
    }
}
*/