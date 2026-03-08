# Classe Televisão

## Descrição

A classe **Televisão** representa uma televisão no mundo real.  
Ao instanciar um objeto dessa classe, é possível definir algumas características básicas do aparelho.

## Atributos

A classe possui os seguintes atributos:

- **volume**: volume da televisão
- **numeroCanal**: número do canal
- **estaLigada**: estado da TV
  - Por padrão, esse atributo é `false`, ou seja, a televisão inicia **desligada**.

## Métodos

A classe também possui alguns métodos para controlar o funcionamento da televisão.

### `ligarTelevisao(boolean estadoTV)`

Esse método controla o **estado da televisão**.

Antes de alterar o estado da TV, é feita uma **validação do estado atual da televisão**, que é recebido como parâmetro.

1. Se o estado da TV for `false` (**televisão desligada**), a validação identifica que a televisão está desligada e então **a TV é ligada**.
2. Se o estado da TV for `true` (**televisão já ligada**), a validação identifica que a televisão já está ligada e então **a TV é desligada**.

---

### `aumentarVolume(boolean estadoTV, int volumeDesejado)`

Esse método controla o **volume da televisão**.

Antes de alterar o volume, ele realiza duas validações:

1. Verifica se a **televisão está ligada**.
2. Verifica se o **volume desejado está entre 0 e 100**.

Somente após passar por essas validações o volume da televisão é alterado.

---

## Como utilizar a classe

Para utilizar os métodos da classe:

1. **Instancie um objeto da classe `Televisão`**
2. **Preencha os atributos necessários**
3. **Chame os métodos desejados**

Exemplo geral de uso:

```java
Televisao tv = new Televisao(23, 515);

tv.ligarTelevisao(tv.estaLigada);
tv.aumentarVolume(tv.estaLigada, 50);
