package com.example.pm2e10645.Configuracion;

public class Transacciones
{
    // Nombre de la base de datos
    public static final String NameDatabase = "PM01DB";

    // tABLAS DE bASE DE DATOS

    public static final  String tablaPersonas = "personas";

    // Campos de la tabla personas
    public static final String id = "id";
    public static final String pais = "pais";
    public static final String nombres = "nombres";
    public static final String telefono = "telefono";

    public static final String nota = "nota";

    // DDL Create and Drop
    public static final String CreateTablePersona = "CREATE TABLE PERSONAS"+
            "( id INTEGER PRIMARY KEY AUTOINCREMENT, pais TEXT, nombres TEXT, telefono INTEGER, "+
            "nota TEXT )";

    public static final String DROPTablePersonas = "DROP TABLE IF EXISTS personas";

    // DML
    public static final String SelectTablePersona = "SELECT * FROM " + Transacciones.tablaPersonas;

}
