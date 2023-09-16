// Classe abstrata para representar um manipulador de troco
abstract class Troco {
    protected Troco proximo;

    public void definirProximo(Troco proximo) {
        this.proximo = proximo;
    }

    public abstract void calcularTroco(int valor);
}

// Manipulador para notas de R$ 50.00
class Nota50 extends Troco {
    @Override
    public void calcularTroco(int valor) {
        if (valor >= 50) {
            int quantidade = valor / 50;
            System.out.println("Notas de R$ 50.00: " + quantidade);
            valor %= 50;
        }
        if (valor > 0 && proximo != null) {
            proximo.calcularTroco(valor);
        }
    }
}

// Manipulador para notas de R$ 10.00
class Nota10 extends Troco {
    @Override
    public void calcularTroco(int valor) {
        if (valor >= 10) {
            int quantidade = valor / 10;
            System.out.println("Notas de R$ 10.00: " + quantidade);
            valor %= 10;
        }
        if (valor > 0 && proximo != null) {
            proximo.calcularTroco(valor);
        }
    }
}

// Manipulador para notas de R$ 2.00
class Nota2 extends Troco {
    @Override
    public void calcularTroco(int valor) {
        if (valor >= 2) {
            int quantidade = valor / 2;
            System.out.println("Notas de R$ 2.00: " + quantidade);
            valor %= 2;
        }
        if (valor > 0 && proximo != null) {
            proximo.calcularTroco(valor);
        }
    }
}

// Manipulador para moedas de R$ 1.00
class Moeda1 extends Troco {
    @Override
    public void calcularTroco(int valor) {
        if (valor >= 1) {
            System.out.println("Moedas de R$ 1.00: " + valor);
        }
    }
}


