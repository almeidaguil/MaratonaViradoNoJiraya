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

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber = ' " + serialNumber + '\'' +
                ", marca = ' " + marca + '\'' +
                '}';
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
/*REGRAS HASHCODE
1- se x.equals(y) == true, y.hashcode(x) == x.hashcode()
2 - y.hashcode() == x.hashcode() não necessariamente o equals de y.equals(x) tem que ser true
3- x.equals(y) == false
4- y.hashcode() != x.hashcode() , x.equals(y) deverá ser falso
 */