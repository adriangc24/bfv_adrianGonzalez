package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

import model.Weapon;
import model.WeaponId;

public class Main3 {
	private static EntityManager manager;
	private static EntityManagerFactory emf;
	static Session session;

	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("persistencia");
		manager = emf.createEntityManager();
		manager.getTransaction().begin();
		
		WeaponId w = new WeaponId(10,"KE7","Light Machine Gun",23,65);
		Weapon w2 = new Weapon(w);
		manager.persist(w2);
		manager.getTransaction().commit();
		System.out.println(w.getWeaponId()+" | "+w.getName()+" | "+w.getType()+" | "+w.getDamage()+" | "+w.getAccuracy());
		
		manager.close();
		emf.close();
	}

}
