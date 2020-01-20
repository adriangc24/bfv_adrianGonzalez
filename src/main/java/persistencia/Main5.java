package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

import model.Bfplayer;

public class Main5 {
	private static EntityManager manager;
	private static EntityManagerFactory emf;
	static Session session;

	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("persistencia");
		manager = emf.createEntityManager();
		manager.getTransaction().begin();
		
		manager.createNativeQuery("call deleteJugador()",Bfplayer.class);
		
		manager.close();
		emf.close();
	}

}
