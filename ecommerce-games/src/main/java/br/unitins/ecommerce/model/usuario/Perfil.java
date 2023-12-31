package br.unitins.ecommerce.model.usuario;

public enum Perfil {

    ADMIN(1, "Administrador"),
    USER(2, "Usuário");
    
    private int id;
    private String label;

    Perfil (int id, String label) {

        this.id = id;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public static Perfil valueOf (Integer id) throws IllegalArgumentException {

        if (id == null)
            return null;

        for (Perfil perfil : Perfil.values()) {
            
            if (id == perfil.id)
                return perfil;
        }

        throw new IllegalArgumentException("Número fora das opções disponíveis");
    }
}
