import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

class Lista {
    private questao06[] array = new questao06[60];
    private int n = 0;

    public Lista() {
        
    }

    public Lista(questao06[] array, int n) {
        this.array = array;
        this.n = n;
    }

    public questao06[] getArray() {
        return array;
    }

    public void setArray(questao06[] array) {
        this.array = array;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void inserirFim(questao06 jogo) throws Exception{
        if(n >= array.length) {
            throw new Exception("ERRO");
        }

        array[n] = jogo;
        n++;
    }

    public questao06 removerFim() throws Exception{
        if(n == 0) {
            throw new Exception("ERRO");
        }

        return array[--n];
    }

    static Boolean isFim(String palavra) {
        boolean result = false;
        if (palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') {
            result = true;
        }
        return result;
    }

    questao06 lerID(String id) throws Exception {
        questao06 jogo = new questao06();
        Scanner arquivo = new Scanner(new File("games.csv"));
        String[] linha = new String[4403];

        int n = 0;
        while (arquivo.hasNext()) {
            linha[n] = arquivo.nextLine();
            n++;
        }

        for(int i = 0; i < n; i++) {
            String categoria = "";
            int virgulas = linha[i].indexOf(',');

            for(int k = 0; k < virgulas; k++) {
                categoria = categoria + linha[i].charAt(k);
            }

            if(categoria.equals(id)) {
                jogo = new questao06();
                String[] array = linha[i].split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

                jogo.setApp_id(Integer.parseInt(array[0]));
                jogo.setNome(array[1]);
            }
        }
        return jogo;
    }

    public void mostrar() {
        for(int i = 0; i < n; i++) {
            System.out.printf("[" + i + "]" + array[i].getJogo());
        }
    }

    public void acoes() throws Exception {
        String quantidade = "";
        quantidade = MyIO.readLine();

        for (int i = 0; i < Integer.parseInt(quantidade); i++) {
            String palavra = "";
            palavra = MyIO.readLine();
            if(palavra.charAt(0) == 'I') {
                String[] array = palavra.split(" ");
                String id = array[1];
    
                inserirFim(lerID(id));
            }
            else if(palavra.charAt(0) == 'R') {
                System.out.println("(R) " + removerFim().getNome());
            }
        }
    }

}

public class questao06 {
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
    private String Jogo;

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

    public String getJogo() {
        return Jogo;
    }

    public void setJogo(String jogo) {
        Jogo = jogo;
    }

    public questao06() {

    }

    public questao06(int app_id, String nome, String release_date, String owners, int age, float price, int dlcs, String[] languages, String website, Boolean windows, Boolean mac, Boolean linux, float upvotes, int avg_pt, String developers, String[] genres, String jogo) {
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
        Jogo = jogo;
    }

    public void imprimir() {
        this.Jogo = app_id + " " + nome + " " + release_date + " " + owners + " " + age + " ";
        DecimalFormat novo = new DecimalFormat("0.00");
        Jogo = Jogo + novo.format(price) + " ";
        Jogo = Jogo + dlcs + " ";
        for(int i = 0; i < languages.length - 1; i++) {
            Jogo = Jogo + languages[i] + ", ";
        }
        Jogo = Jogo + languages[languages.length - 1] + " " + website + " " + windows + " " + mac
        + " " + linux + " "
        + ((int)Math.round(upvotes * 100)) + "% "
        + (int)(avg_pt / 60) + "h " + (avg_pt % 60) + "m ";
        Jogo = Jogo + developers + " " + "[";
        for(int i = 0; i < genres.length - 1; i++) {
            Jogo = Jogo + genres[i] + ", ";
        }
        Jogo = Jogo + genres[genres.length - 1] + "]";
        
    }

    public void ler(String frase) throws IOException, ParseException {
        questao06 jogo = new questao06();
        Scanner arquivo = new Scanner(new File("games.csv"));
        String[] linha = new String[4403];

        int n = 0;
        while (arquivo.hasNext()) {
            linha[n] = arquivo.nextLine();
            n++;
        }

        for(int i = 0; i < n; i++) {
            String categoria = "";
            int virgulas = linha[i].indexOf(',');

            for(int k = 0; k < virgulas; k++) {
                categoria = categoria + linha[i].charAt(k);
            }

            if(categoria.equals(frase)) {
                jogo = new questao06();
                String[] array = linha[i].split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

                jogo.setApp_id(Integer.parseInt(array[0]));
                jogo.setNome(array[1]);
                jogo.setReleaseDate(array[2].replaceAll("\"", ""));
                jogo.setOwners(array[3]);
                jogo.setAge(Integer.parseInt(array[4]));
                jogo.setPrice(Float.parseFloat(array[5]));
                jogo.setDlcs(Integer.parseInt(array[6]));
                jogo.setLanguages(array[7].replaceAll("'", "").replaceAll("\"", "").split(","));
                jogo.setWebsite(array[8]);
                jogo.setWindows(Boolean.parseBoolean(array[9]));
                jogo.setMac(Boolean.parseBoolean(array[10]));
                jogo.setLinux(Boolean.parseBoolean(array[11]));
                jogo.setUpvotes(Float.parseFloat(array[12]) / (Float.parseFloat(array[12]) + (Float.parseFloat(array[13]))));
                jogo.setAvg_pt(Integer.parseInt(array[14]));
                jogo.setDevelopers(array[15].replaceAll("\"", ""));
                jogo.setGenres(array[16].replaceAll("\"", "").split(","));
                jogo.imprimir();
            }
        }
    }

    static Boolean isFim(String palavra) {
        boolean result = false;
        if (palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') {
            result = true;
        }
        return result;
    }

    public static void main (String[] args) throws Exception {
        Scanner arquivo = new Scanner(System.in);
        String aux = "";
        Lista lista = new Lista();

        aux = arquivo.nextLine();
        while(isFim(aux) == false) {
            questao06 GAME = new questao06();
            GAME.ler(aux);
            lista.inserirFim(GAME);
            aux = arquivo.nextLine();
        }
        arquivo.close();
        lista.acoes();
        lista.mostrar();
    }
}
