package apidiaslaborales.apidiaslaborales.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Calendario")
public class Calendario {
    @Id
    @GenericGenerator(name = "secuencia_Calendario", strategy = "increment")
    private long id;

    @Column(name = "Fecha", nullable = false)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "IdTipo", nullable = false)
    private Tipo tipo;

    @Column(name = "Descripcion")
    private String descripcion;

    public Calendario() {
    }

    public Calendario(Long id, Date fecha, Tipo tipo, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
