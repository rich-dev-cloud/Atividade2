public class LanternaMagica {
    // Atributos
    private String cor;
    private int intensidade;
    private int energia;
    private boolean ligada;
    private String modo;

    // Construtor
    public LanternaMagica(String cor, int intensidade, int energia) {
        this.cor = cor;
        this.intensidade = intensidade;
        this.energia = energia;
        this.ligada = false;
        this.modo = "iluminação";
    } 
    // Funções
    public void ligar() { // Não retorna nada
        if (energia > 0) ligada = true;
    }     
    public void desligar() { // Não retorna nada
        ligada = false;
    }
    public void ajustarIntensidade(int novaIntensidade) { // Não retorna nada
        if (novaIntensidade >= 0 &&
    novaIntensidade <= 100)   
                intensidade = novaIntensidade;
    }
    public int verificarEnergia() { 
//retorna a energia
        return energia;
    }

    public void mudarModo(String novoModo){ 
        // Nã retorna nada
    if (novoModo.equals("iluminação"))  {
        modo = novoModo;
        }else if(novoModo.equals("detecção")){
            modo = novoModo;
        } else {
            modo = "projeção"; 
        }


    }
 
public static void main(String[] args) {
     LanternaMagica lanterna = new LanternaMagica("dourada", 50, 80);
             // testando as funções
             lanterna.ligar();
             lanterna.ajustarIntensidade(70);
         System.out.println("Energia restante: " + lanterna.verificarEnergia());
                    lanterna.mudarModo("detecção");
                  lanterna.desligar();  
        }

    }
