package mx.com.gm.sga.domain.dev;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-02-09T22:05:26")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, Persona> persona;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> username;

}