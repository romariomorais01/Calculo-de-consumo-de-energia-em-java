import java.util.ArrayList;
import java.util.List;

class Dispositivo {
    String nome;
    double consumoDia; // Total de KWh gastos pelo dispositivo no dia.
    int quantidade;

    public Dispositivo(String nome, double consumoDia, int quantidade) {
        this.nome = nome;
        this.consumoDia = consumoDia;
        this.quantidade = quantidade;
    }

    public double consumoMensal (int dias) {
        return consumoDia*quantidade*dias;
    }
}
public class ConsumoEnergia {
    public static void main(String[]args){
        List<Dispositivo> dispositivos = new ArrayList<>();
        dispositivos.add(new Dispositivo("Geladeira", 1.2,1));
        dispositivos.add (new Dispositivo("TV", 0.3, 2));
        dispositivos.add (new Dispositivo ("Computador",0.9, 1));

        double valorKwh = 0.98;
        int diasMes = 30;

        double consumoTotal = 0;
        for (Dispositivo d:dispositivos){
            consumoTotal+= d.consumoMensal(diasMes);
        }
double custoTotal = consumoTotal * valorKwh;

System.out.printf("Consumo total no mês: %.2f kwh%n", consumoTotal);
System.out.printf("Custo total no mês: R$ %.2f%n", custoTotal);

    }
}