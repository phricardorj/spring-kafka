# Kafka para Leigos
Kafka é uma plataforma de streaming de dados que permite o envio, armazenamento e processamento de grandes volumes de dados em tempo real.

## O que é Kafka?
Kafka é como um sistema de correio para dados. Imagine que você está enviando mensagens por correio para várias pessoas ao redor do mundo. Em vez de enviar as mensagens individualmente, você coloca todas as mensagens em envelopes e as envia para uma estação central. Esta estação central, ou "Kafka", então distribui esses envelopes para os destinatários corretos.

## Exemplo do Dia a Dia
Digamos que você tem um sistema de compras online. Cada vez que um cliente faz uma compra, uma mensagem é enviada para Kafka. Essa mensagem pode conter detalhes sobre o produto comprado, o cliente e o momento da compra. Os outros sistemas, como o sistema de análise de vendas ou o sistema de recomendação de produtos, podem então pegar essas mensagens em tempo real e agir com base nelas.

## Group ID
O Group ID é como a identificação dos destinatários dos envelopes no nosso exemplo de correio. Quando você tem um conjunto de consumidores de Kafka que estão todos interessados no mesmo tipo de dados, você pode agrupá-los usando um Group ID. Por exemplo, se você tem um grupo de sistemas de análise de vendas, todos esses sistemas podem usar o mesmo Group ID para que Kafka saiba para onde enviar as mensagens relevantes.
É uma parte importante da configuração ao consumir dados de um tópico em Kafka. Ele permite que consumidores sejam organizados em grupos, facilitando o processamento paralelo de mensagens.

## Por que é necessário informar um Group ID?
Quando múltiplos consumidores estão lendo dados de um tópico em Kafka, é essencial coordenar o processamento das mensagens. O Group ID é usado para identificar um grupo de consumidores que estão compartilhando a carga de trabalho de processamento de mensagens de um tópico. Isso significa que, se um grupo de consumidores estiver consumindo mensagens de um tópico, o Kafka garante que cada mensagem seja processada apenas por um consumidor dentro desse grupo.

## Estratégias de Nomeação do Group ID
Escolher um bom nome para o Group ID é importante para garantir a escalabilidade e a manutenção do seu sistema Kafka. Algumas boas práticas incluem:

- **Descritivo**: O nome do Group ID deve refletir a função ou o propósito do grupo de consumidores. Isso torna mais fácil entender o que cada grupo está fazendo quando você olha para a configuração.

- **Único**: Certifique-se de que o Group ID seja único para cada grupo de consumidores. Isso evita conflitos e garante que cada grupo tenha sua própria identidade no ecossistema Kafka.

- **Estável**: Evite alterar o Group ID com frequência, a menos que seja absolutamente necessário. Mudanças frequentes podem levar a interrupções no processamento de mensagens e dificultar a depuração de problemas.

- **Escala**: Se você espera que o número de consumidores no grupo aumente com o tempo, considere escolher um nome que permita escalabilidade, como incluir um número ou uma descrição genérica que não limite o crescimento futuro.

Por exemplo, se você tiver um grupo de consumidores responsáveis por processar pedidos de compras, um nome de Group ID adequado poderia ser "pedido-processamento". Isso fornece uma descrição clara do propósito do grupo e é facilmente identificável durante a operação e a manutenção do sistema.

Lembre-se de que a escolha do Group ID é uma decisão importante que afeta a arquitetura e o desempenho do seu sistema Kafka, portanto, pense com cuidado ao selecionar um nome.

## Tópicos (Topics)
Os tópicos são como as categorias de mensagens em Kafka. Cada mensagem que é enviada para Kafka é atribuída a um tópico específico. No exemplo do sistema de compras online, você pode ter tópicos como "compras", "clientes" e "produtos". Isso ajuda a organizar e categorizar as mensagens, facilitando o consumo por sistemas interessados apenas em tipos específicos de dados.

## 🖖 Autor<br>
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/phricardorj">
        <img src="https://avatars.githubusercontent.com/u/70300680" width="100px;" alt="phricardorj"/><br>
        <sub>
          <b>Pedro Ricardo</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
