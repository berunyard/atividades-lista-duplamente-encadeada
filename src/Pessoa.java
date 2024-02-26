public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private String rg;

    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return rg;
    }

    public void setRG(String rg) {
        this.rg = rg;
    }

    @Override
    public int compareTo(Pessoa outra) {
        if (this.getRG().compareTo(outra.getRG()) > 0) {
            return 1;
        } else if (this.getRG().compareTo(outra.getRG()) < 0) {
            return -1;
        } else {
            return 0;
        }

    }
}
