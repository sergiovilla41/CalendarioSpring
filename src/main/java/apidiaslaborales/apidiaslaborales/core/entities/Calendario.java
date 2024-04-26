package apidiaslaborales.apidiaslaborales.core.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "calendario")
public class calendario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "calendario_secuencia")
    @GenericGenerator(name = "calendario_secuencia", strategy = "increment")
    private long id;

    @Column(name = "Fecha", nullable = false)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "IdTipo", nullable = false)
    private tipo tipo;

    @Column(name = "Descripcion")
    private String descripcion;

    public calendario() {
    }

    public calendario(long id, Date fecha, apidiaslaborales.apidiaslaborales.core.entities.tipo tipo,
            String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public tipo getTipo() {
        return tipo;
    }

    public void setTipo(tipo tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
