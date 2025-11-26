# ConsumoEnergia

Um programa simples em **Java** para calcular o consumo mensal de energia elétrica e o custo total, com base em:
- Lista de dispositivos;
- Consumo diário de cada dispositivo (em kWh);
- Quantidade de dispositivos;
- Valor do kWh vigente;
- Número de dias do mês;

##  Como funciona
O programa soma o consumo diário de todos os dispositivos, multiplica pelo número de dias do mês e calcula o custo total com base no valor do kWh informado.

## Estrutura do projeto
- `Dispositivo.java` → Classe que representa cada dispositivo (nome, consumo diário, quantidade).
- `ConsumoEnergia.java` → Classe principal que realiza os cálculos e exibe os resultados.

## Como executar
1. Compile o código:
   ```bash
   javac ConsumoEnergia.java

  ## Licença
Este projeto é de uso livre para fins de estudo e aprendizado.
