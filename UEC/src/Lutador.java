public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    //constructor
    
public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }



    //metodos
    public void apresenta() {
        System.out.print("Lutador [nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + ", altura=" + altura
        + ", peso=" + peso + ", categoria=" + categoria + ", vitorias=" + vitorias + ", derrotas=" + derrotas
        + ", empates=" + empates + "]");
    }

    public void ganhaLuta(){
        this.setVitorias(this.getVitorias() + 1);
        //this.vitorias = this.vitorias + 1;

    }

    public void perdeluta(){
        this.setDerrotas(this.getDerrotas() + 1);

    }

    public void empataLuta(){
        this.setEmpates(this.getEmpates() + 1);

    }

    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    //metodo interno
    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "invalido";
        } else if(this.peso <= 70.3) {
            this.categoria = "leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "pesado";
        } else {
            this.categoria = "invalido";
        }

        }
    

    public int getVitorias() {
        return vitorias;
    }



    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }



    public int getDerrotas() {
        return derrotas;
    }



    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }



    public int getEmpates() {
        return empates;
    }



    public void setEmpates(int empates) {
        this.empates = empates;
    }
  
    
}
