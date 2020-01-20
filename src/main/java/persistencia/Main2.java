package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

import model.Bfplayer;

public class Main2 {
	private static EntityManager manager;
	private static EntityManagerFactory emf;
	static Session session;

	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("persistencia");
		manager = emf.createEntityManager();
		manager.getTransaction().begin();
		
		mostrarRatio();
		
		manager.close();
		emf.close();
	}

	private static void mostrarRatio() {
		List <Bfplayer>players = manager.createNativeQuery("select * from bfplayer",Bfplayer.class).getResultList();
		for(Bfplayer x : players) {
			System.out.println(x.getUserId()+" | "+x.getKills()+" / "+x.getDeads());
		}
	}
	}


