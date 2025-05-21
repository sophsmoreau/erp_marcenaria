package controller;

import model.Material;
import service.MaterialService;
import java.sql.Connection;

public class MaterialController {
    private MaterialService service;

    public MaterialController(Connection conn) {
        this.service = new MaterialService(conn);
    }

    public void criarMaterialDeExemplo() {
        Material m = new Material();
        m.setNome("MDF Branco");
        m.setTipo("Chapa");
        m.setUnidadeMedida("m2");
        m.setCustoUnitario(87.90);

        try {
            service.registrar(m);
            System.out.println("Material cadastrado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar material: " + e.getMessage());
        }
    }
}

