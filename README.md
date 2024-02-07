# Programa de Cálculo para Retângulo

Este programa calcula a área, perímetro e diagonal de um retângulo com base nos valores de largura e altura fornecidos pelo usuário.

## Descrição das Classes

### Retângulo

- `Width`: double
- `Height`: double

#### Métodos

- `Area()`: double
- `Perimetro()`: double
- `Diagonal()`: double

## Instruções de Uso

1. Execute o programa.
2. Insira os valores de largura e altura do retângulo quando solicitado.
3. O programa calculará e exibirá a área, perímetro e diagonal do retângulo.

## Exemplo de Uso

```java
import entities.Triangule;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangule retangulo;
        retangulo = new Triangule();
        System.out.println("Entre com os seguintes valores:");
        System.out.print("Width: ");
        retangulo.width = sc.nextDouble();

        System.out.print("Height: ");
        retangulo.height = sc.nextDouble();

        System.out.println(retangulo);

        sc.close();
    }
}
```

## Resultado Esperado

```
Entre com os seguintes valores:
Width: 5
Height: 10
Área retângulo: 50.0, Perímetro retângulo: 30.0, Diagonal retângulo: 11.180339887498949
```

