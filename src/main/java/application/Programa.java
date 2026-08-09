package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Pedro Henrique", "pedro@gmail.com");
        Pessoa p2 = new Pessoa(null, "Maria Souza", "maria@gmail.com");
        Pessoa p3 = new Pessoa(null, "Ana Silva", "ana@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();

        System.out.println("Tudo pronto!");

        em.close();
        emf.close();
        
    }
}
