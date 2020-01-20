package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

import model.Bfplayer;

public class Main4 {
	private static EntityManager manager;
	private static EntityManagerFactory emf;
	static Session session;

	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("persistencia");
		manager = emf.createEntityManager();
		manager.getTransaction().begin();
		
		 Bfplayer p = new Bfplayer("adri",2, 10, 4, 0, 0);
		if(manager.find(Bfplayer.class, p.getUserId())==null) {
			System.out.println("Introduint jugador");
			manager.persist(p);
		}
		else {
			System.out.println("Jugador "+p.getUserId()+" ja existeix");
		}
		manager.getTransaction().commit();
		System.out.println(p.getUserId()+" | "+p.getClassId()+" | "+p.getPrimaryWeapon()+" | "+p.getDevice1()+p.getKills()+" | "+p.getDeads());
		
		manager.close();
		emf.close();
	}

}
