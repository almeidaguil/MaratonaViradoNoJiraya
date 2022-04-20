package orientacaoAObjetos.yYcolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
/*REGRAS DO EQUALS
1- Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
2- Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
3- Transitividade: para x, y, z, diferentes de null. Se x.equals(y) == true, e x.equals(y) == true, logo y.equals(z) == true
4- Consistente: x.equals(x) sempre retorna true se x for diferente de null
5- para x diferente de null, x.equals(null) tem que retornar falso
 */