package apitiendavideo.apitiendavideo.modelos;

import javax.persistence.*;

@Entity
@Table(name = "region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "region", nullable = true, length = 100)
    private String region;
    @Column(name = "codigo")
    private String codigo;
    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Pais pais;

    public Region(){}

    public Region(long id, String region, String codigo, Pais pais) {
        this.id = id;
        this.region = region;
        this.codigo = codigo;
        this.pais = pais;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
