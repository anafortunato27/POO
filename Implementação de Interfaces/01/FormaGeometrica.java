public interface FormaGeometrica{
    public String getNomeForma();
    public Double getArea();
    public Double getPerimetro();
}

class Retangulo implements FormaGeometrica {
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public String getNomeForma() {
        return "Retângulo";
    }
    
    public Double getArea() {
        return (base * altura);
    }
    
    public Double getPerimetro() {
        return 2 * (base * altura);
    }
    
    public double getBase() {
        return this.base;
    }
    
    public double getAltura() {
        return this.altura;
    }
}

class Circulo implements FormaGeometrica {
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public String getNomeForma() {
        return "Círculo";
    }
    
    public Double getArea() {
        return (3.14 * (raio*raio));
    }
    
    public Double getPerimetro() {
        return (2 * 3.14 * raio);
    }
    
    public double getRaio() {
        return this.raio;
    }
}

class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }
    
    public String getNome() {
        return "Quadrado";
    }
    
    public double getLado() {
        return getBase();
    }
}