package com.example.Taller2.domains;

public class ProductoDAOFactory {

    private static ProductoDAO mySQLInstance = null;
    private static ProductoDAO oracleInstance = null;

    public static ProductoDAO configureAdapterDB(String tipoBaseDatos) {
        if (tipoBaseDatos.equalsIgnoreCase("MySQL")) {
            if (mySQLInstance == null) {
                mySQLInstance = new ProductoDAOMySQL();
                System.out.println("Instancia MySQL creada");
            }
            return mySQLInstance;
        } else if (tipoBaseDatos.equalsIgnoreCase("Oracle")) {
            if (oracleInstance == null) {
                oracleInstance = new ProductoDAOOracle();
                System.out.println("Instancia Oracle creada");
            }
            return oracleInstance;
        } else {
            throw new IllegalArgumentException("Base de datos no soportada: " + tipoBaseDatos);
        }
    }
}




/*package com.example.Taller2.domains;

public class ProductoDAOFactory {

    public static ProductoDAO configureAdapterDB(String tipoBaseDatos) {
        if (tipoBaseDatos.equalsIgnoreCase("MySQL")) {
            System.out.println("Seleccionada base de datos: MySQL");
            return new ProductoDAOMySQL();
        } else if (tipoBaseDatos.equalsIgnoreCase("Oracle")) {
            System.out.println("Seleccionada base de datos: Oracle");
            return new ProductoDAOOracle();
        } else {
            throw new IllegalArgumentException("Base de datos no soportada: " + tipoBaseDatos);
        }
    }
}*/
