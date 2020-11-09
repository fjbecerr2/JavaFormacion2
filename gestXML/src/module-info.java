module gestXML{
    requires transitive java.xml;
}
/*
Si no añades un fichero module-info.java a tu proyecto, éste será parte del 
módulo unnamed (sin nombre). y podrá ver (importar) todo el código de este módulo, 
más el código en el módulo java.base (lo que podríamos decir es que son los 
paquetes básicos de JavaSE) más el módulo raíz java.se,
 que es la manera de tener un comportamiento similar a lo que era Java 8:
 
 Resuelve el problema: 
 is accessible from more than one module: unnamed,
*/